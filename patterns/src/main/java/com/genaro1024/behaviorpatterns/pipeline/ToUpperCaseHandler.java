package com.genaro1024.behaviorpatterns.pipeline;

public class ToUpperCaseHandler implements Handler<String,String> {

    @Override
    public String process(String input) {
        String result = input.toUpperCase();
        System.out.println("ToUpperCase:"+result);
        return result;
    }

}
