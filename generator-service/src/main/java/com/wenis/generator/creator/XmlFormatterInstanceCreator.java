package com.wenis.generator.creator;

import com.google.gson.InstanceCreator;
import org.mybatis.generator.api.XmlFormatter;
import org.mybatis.generator.api.dom.DefaultXmlFormatter;

import java.lang.reflect.Type;

public class XmlFormatterInstanceCreator implements InstanceCreator<XmlFormatter> {

    public XmlFormatterInstanceCreator() {
    }

    @Override
    public XmlFormatter createInstance(Type type) {
        return new DefaultXmlFormatter();
    }
}
