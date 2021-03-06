package com.wenis.generator.api;

import com.wenis.generator.vo.ContextGenerator;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

public interface GeneratorApi {

    @RequestMapping(value = "/generator/save_config", method = RequestMethod.POST)
    @ResponseBody String saveConfig(@RequestBody ContextGenerator contextGenerator) throws IOException;

    @RequestMapping(value = "/generator/do_generator", method = RequestMethod.POST)
    @ResponseBody String generator();
}
