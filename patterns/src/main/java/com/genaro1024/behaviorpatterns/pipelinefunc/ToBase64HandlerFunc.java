package com.genaro1024.behaviorpatterns.pipelinefunc;

import java.util.function.Function;
import java.util.Base64;

public class ToBase64HandlerFunc {
    public Function<String,String> toBase64() {
        return input -> {
            byte[] encodedBytes = Base64.getEncoder().encode(input.getBytes());
            String result = new String(encodedBytes);
            System.out.println("ToBase64:"+result);
            return result;
        };
    }
}
