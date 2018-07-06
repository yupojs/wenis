package com.wenis.generator.service;

import com.alibaba.fastjson.JSON;
import com.wenis.generator.vo.ContextGenerator;
import org.apache.commons.io.FileUtils;
import org.mybatis.generator.config.*;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class GeneratorServiceImpl implements GeneratorService{

    private static final String PATH = System.getProperty("user.dir") + File.separator + "files";

    @Override
    public String saveConfig(ContextGenerator contextGenerator) throws IOException {
        contextGenerator = new ContextGenerator(ModelType.CONDITIONAL);
        contextGenerator.setId("DB2TABLE");

        JDBCConnectionConfiguration jdbcConnectionConfiguration= new JDBCConnectionConfiguration();
        jdbcConnectionConfiguration.setDriverClass("com.mysql.jdbc.Driver");
        jdbcConnectionConfiguration.setConnectionURL("jdbc:mysql://50.23.190.57:3306/newsitetest");
        jdbcConnectionConfiguration.setUserId("pretestadmin");
        jdbcConnectionConfiguration.setPassword("aaaaa");


        SqlMapGeneratorConfiguration sqlMapGeneratorConfiguration = new SqlMapGeneratorConfiguration();
        sqlMapGeneratorConfiguration.setTargetPackage("com.demo.mapper");
        sqlMapGeneratorConfiguration.setTargetProject("src");
        sqlMapGeneratorConfiguration.addProperty("enableSubPackages","true");

        JavaTypeResolverConfiguration javaTypeResolverConfiguration = new JavaTypeResolverConfiguration();
        javaTypeResolverConfiguration.addProperty("forceBigDecimals", "false");

        JavaModelGeneratorConfiguration javaModelGeneratorConfiguration = new JavaModelGeneratorConfiguration();
        javaModelGeneratorConfiguration.setTargetPackage("com.demo.entity");
        javaModelGeneratorConfiguration.setTargetProject("src");
        javaModelGeneratorConfiguration.addProperty("trimStrings", "true");
        javaModelGeneratorConfiguration.addProperty("enableSubPackages", "true");

        JavaClientGeneratorConfiguration javaClientGeneratorConfiguration = new JavaClientGeneratorConfiguration();
        javaClientGeneratorConfiguration.setTargetPackage("com.demo.mapper.markting_platform");
        javaClientGeneratorConfiguration.setTargetProject("src");
        javaClientGeneratorConfiguration.setConfigurationType("XMLMAPPER");
        javaClientGeneratorConfiguration.addProperty("enableSubPackages", "true");

        TableConfiguration tableConfiguration1 = new TableConfiguration(contextGenerator);
        tableConfiguration1.setSelectByExampleQueryId("true");
        tableConfiguration1.setTableName("rs_category");
        tableConfiguration1.setDomainObjectName("RsCategory");

        CommentGeneratorConfiguration commentGeneratorConfiguration = new CommentGeneratorConfiguration();
        commentGeneratorConfiguration.addProperty("suppressDate", "true");
        commentGeneratorConfiguration.addProperty("supressAllComments", "true");

        contextGenerator.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration);
        contextGenerator.setJdbcConnectionConfiguration(jdbcConnectionConfiguration);
        contextGenerator.setSqlMapGeneratorConfiguration(sqlMapGeneratorConfiguration);
        contextGenerator.setJavaTypeResolverConfiguration(javaTypeResolverConfiguration);
        contextGenerator.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration);
        contextGenerator.addTableConfiguration(tableConfiguration1);
        contextGenerator.setCommentGeneratorConfiguration(commentGeneratorConfiguration);
        contextGenerator.setTargetRuntime("MyBatis3");


        File file = new File(PATH + File.separatorChar + "test.json");
        FileUtils.touch(file);
        FileUtils.writeStringToFile(file, JSON.toJSONString(contextGenerator));

        return JSON.toJSONString(contextGenerator);
    }
}
