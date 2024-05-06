package com.genaro1024.behaviorpatterns.pipeline;
import java.util.Base64;

public class ToBase64Handler implements Handler<String, String>{

    @Override
    public String process(String input) {
        byte[] encodedBytes = Base64.getEncoder().encode(input.getBytes());
        String result = new String(encodedBytes);
        System.out.println("ToBase64:"+result);
        return result;
    }

}
