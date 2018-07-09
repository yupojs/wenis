package com.wenis.generator.creator;

import com.google.gson.InstanceCreator;
import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.internal.DefaultCommentGenerator;

import java.lang.reflect.Type;

public class CommentGeneratorInstanceCreator implements InstanceCreator<CommentGenerator> {

    public CommentGeneratorInstanceCreator() {

    }

    @Override
    public CommentGenerator createInstance(Type type) {
        return new DefaultCommentGenerator();
    }
}
