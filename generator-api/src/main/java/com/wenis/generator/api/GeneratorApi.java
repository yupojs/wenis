package com.wenis.generator.api;

import com.wenis.generator.vo.ContextGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface GeneratorApi {

    @RequestMapping(value = "/generator/save_config", method = RequestMethod.POST)
    void saveConfig(@RequestParam ContextGenerator contextGenerator);
}
