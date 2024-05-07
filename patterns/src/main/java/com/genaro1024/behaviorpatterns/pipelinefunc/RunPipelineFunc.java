package com.genaro1024.behaviorpatterns.pipelinefunc;

import java.util.function.Function;

public class RunPipelineFunc {
    @SuppressWarnings("unused")
    public static void Run(){
        System.out.println("################## PIPELINEFUNC ###################");
        Function<String, String> pipelinefunc = text ->
                                                new ToUpperCaseHandlerFunc().toUpperCase()
                                                .andThen(new RemoveWhitespaceHandlerFunc().removeWhitespace() )
                                                .andThen(new ToBase64HandlerFunc().toBase64())
                                                .apply(text); 
        String pipeResult = pipelinefunc.apply("Hello World");
        System.out.println("Result:"+ pipeResult);      
        
    }
    public static String generateMenu(){
        return "PipelineFunc";
    }     
}
