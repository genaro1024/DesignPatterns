package com.genaro1024.behaviorpatterns.pipelinefunc;

import java.util.function.Function;

public class RemoveWhitespaceHandlerFunc {
    public Function<String,String> removeWhitespace() {
        return input -> {
            String result = input.replaceAll("\\s", "");
            System.out.println("RemoveWhitespace:"+result);
            return result;
        };
    }
}
