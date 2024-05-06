package com.genaro1024.behaviorpatterns.pipelinefunc;

import java.util.function.Function;

public class ToUpperCaseHandlerFunc {
    public Function<String,String> toUpperCase() {
        return input -> {
            String result = input.toUpperCase();
            System.out.println("ToUpperCase:"+result);
            return result;
        };
    }
}
