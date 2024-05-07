package com.genaro1024.behaviorpatterns.pipeline;

public class RunPipeline {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void Run(){
        System.out.println("#################### PIPELINE #####################");
        Pipeline pipeline = new Pipeline<String,String>(new ToUpperCaseHandler())
                                            .addHandler(new RemoveWhitespaceHandler())
                                            .addHandler(new ToBase64Handler());
        String pipelineResult = (String) pipeline.execute("Hello World");                                    
        System.out.println("Result:"+ pipelineResult);
    }
    public static String generateMenu(){
        return "Pipeline";
    }
    
}
