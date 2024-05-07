package com.genaro1024;

import com.genaro1024.behaviorpatterns.iterator.RunIterator;
import com.genaro1024.behaviorpatterns.pipeline.RunPipeline;
import com.genaro1024.behaviorpatterns.pipelinefunc.RemoveWhitespaceHandlerFunc;
import com.genaro1024.behaviorpatterns.pipelinefunc.RunPipelineFunc;
import com.genaro1024.behaviorpatterns.pipelinefunc.ToBase64HandlerFunc;
import com.genaro1024.behaviorpatterns.pipelinefunc.ToUpperCaseHandlerFunc;
import com.genaro1024.creationpatterns.prototype.Circle;
import com.genaro1024.creationpatterns.prototype.RunPrototype;
import com.genaro1024.creationpatterns.singleton.RunSingleton;
import com.genaro1024.creationpatterns.singleton.Singleton;
import java.util.function.Function;

public class Main {
     public static void main(String[] args) {
        System.out.println("################ CREATION PATTERNS ################");
        RunSingleton.Run();
        RunPrototype.Run();
        System.out.println("################ BEHAVIOR PATTERNS ################");
        RunPipeline.Run();
        RunPipelineFunc.Run();
        RunIterator.Run();
                                            

    }
}