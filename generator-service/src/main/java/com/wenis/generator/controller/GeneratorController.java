package com.wenis.generator.controller;

import com.wenis.generator.api.GeneratorApi;
import com.wenis.generator.service.GeneratorService;
import com.wenis.generator.vo.ContextGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class GeneratorController implements GeneratorApi {
    @Autowired
    private GeneratorService generatorService;

    @Override
    public void saveConfig(ContextGenerator contextGenerator) throws IOException {
        generatorService.saveConfig(contextGenerator);
    }
}
