package com.genaro1024.behaviorpatterns.pipeline;

public class RemoveWhitespaceHandler implements Handler<String,String> {

    @Override
    public String process(String input) {
        String result = input.replaceAll("\\s", "");
        System.out.println("RemoveWhitespace:"+result);
        return result;
    }

}
