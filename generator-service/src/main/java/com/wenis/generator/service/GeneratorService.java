package com.wenis.generator.service;

import com.wenis.generator.vo.ContextGenerator;

import java.io.IOException;

public interface GeneratorService {
    void saveConfig(ContextGenerator contextGenerator) throws IOException;
}
