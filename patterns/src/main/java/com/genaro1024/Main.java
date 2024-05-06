package com.genaro1024;

import com.genaro1024.behaviorpatterns.iterator.Box;
import com.genaro1024.behaviorpatterns.pipeline.Pipeline;
import com.genaro1024.behaviorpatterns.pipeline.RemoveWhitespaceHandler;
import com.genaro1024.behaviorpatterns.pipeline.ToBase64Handler;
import com.genaro1024.behaviorpatterns.pipeline.ToUpperCaseHandler;
import com.genaro1024.behaviorpatterns.pipelinefunc.RemoveWhitespaceHandlerFunc;
import com.genaro1024.behaviorpatterns.pipelinefunc.ToBase64HandlerFunc;
import com.genaro1024.behaviorpatterns.pipelinefunc.ToUpperCaseHandlerFunc;
import com.genaro1024.creationpatterns.singleton.Singleton;
import java.util.function.Function;

public class Main {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        System.out.println("################ CREATION PATTERNS ################");
        System.out.println("#################### SINGLETON ####################");
        Singleton singleton01 = Singleton.getInstance("value01");
        Singleton singleton02 = Singleton.getInstance("value02");
        System.out.println("singleton01:"+singleton01.getValue());
        System.out.println("singleton02:"+singleton02.getValue());
        System.out.println("##################### BUILDER ################@####");

        System.out.println("################ BEHAVIOR PATTERNS ################");
        System.out.println("#################### PIPELINE #####################");

        Pipeline pipeline = new Pipeline<String,String>(new ToUpperCaseHandler())
                                            .addHandler(new RemoveWhitespaceHandler())
                                            .addHandler(new ToBase64Handler());

        String pipelineResult = (String) pipeline.execute("Hello World");                                    
        System.out.println("Result:"+ pipelineResult);

        System.out.println("#################### PIPELINE #####################");

        Function<String, String> pipelinefunc = text ->
                                                new ToUpperCaseHandlerFunc().toUpperCase()
                                                .andThen(new RemoveWhitespaceHandlerFunc().removeWhitespace() )
                                                .andThen(new ToBase64HandlerFunc().toBase64())
                                                .apply(text);

        String pipeResult = pipelinefunc.apply("Hello World");
        System.out.println("Result:"+ pipeResult);

        System.out.println("#################### ITERATOR #####################");

        Box box = new Box(new String[]{"Hello", "World", "Car", "Box", "Dog", "Cat"});
        while(box.hasNext()){
            String text = box.getNext();
            System.out.println("Item:"+ text);
        }
                                            

    }
}