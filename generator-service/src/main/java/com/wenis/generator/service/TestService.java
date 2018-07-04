package com.wenis.generator.service;

import com.wenis.generator.common.Generator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TestService {
    static {
        File configFile = new File("D://generatorConfig.xml");
        List<String> warnings = new ArrayList<>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        try {
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback shellCallback = new DefaultShellCallback(true);

            Generator generator = new Generator(config, shellCallback, Collections.EMPTY_LIST);

            generator.generate(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(configFile.getAbsolutePath());
    }
}
