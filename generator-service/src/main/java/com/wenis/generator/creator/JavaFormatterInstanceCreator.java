package com.wenis.generator.creator;

import com.google.gson.InstanceCreator;
import org.mybatis.generator.api.JavaFormatter;
import org.mybatis.generator.api.dom.DefaultJavaFormatter;

import java.lang.reflect.Type;

public class JavaFormatterInstanceCreator implements InstanceCreator<JavaFormatter> {

    public JavaFormatterInstanceCreator() {
    }

    @Override
    public JavaFormatter createInstance(Type type) {
        return new DefaultJavaFormatter();
    }
}
