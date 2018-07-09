package com.wenis.generator.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wenis.generator.common.Generator;
import com.wenis.generator.creator.CommentGeneratorInstanceCreator;
import com.wenis.generator.creator.JavaFormatterInstanceCreator;
import com.wenis.generator.creator.XmlFormatterInstanceCreator;
import com.wenis.generator.vo.ContextGenerator;
import org.apache.commons.io.FileUtils;
import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.JavaFormatter;
import org.mybatis.generator.api.XmlFormatter;
import org.mybatis.generator.api.dom.DefaultJavaFormatter;
import org.mybatis.generator.config.*;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class GeneratorServiceImpl implements GeneratorService{

    private static final String PATH = System.getProperty("user.dir") + File.separator + "files";

    @Override
    public String saveConfig(ContextGenerator contextGenerator) throws IOException {
        contextGenerator = new ContextGenerator(ModelType.CONDITIONAL);
        Gson gson = new Gson();
        File file = new File(PATH + File.separatorChar + "test.json");
        FileUtils.touch(file);
        FileUtils.writeStringToFile(file, gson.toJson(contextGenerator));

        return gson.toJson(contextGenerator);
    }

    @Override
    public String generator() {
        File file = new File(PATH + File.separatorChar + "test.json");
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(CommentGenerator.class, new CommentGeneratorInstanceCreator())
                .registerTypeAdapter(JavaFormatter.class, new JavaFormatterInstanceCreator())
                .registerTypeAdapter(XmlFormatter.class, new XmlFormatterInstanceCreator())
                .create();

        try {
            String jsonStr = FileUtils.readFileToString(file);
            ContextGenerator contextGenerator = gson.fromJson(jsonStr, ContextGenerator.class) ;

            List<Context> contexts = new ArrayList<>();
            contexts.add(contextGenerator);

            DefaultShellCallback shellCallback = new DefaultShellCallback(true);
            Generator generator = new Generator(shellCallback, Collections.EMPTY_LIST);
            generator.generator(null, null, true, contexts);

            return "";
        } catch (IOException e) {

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
