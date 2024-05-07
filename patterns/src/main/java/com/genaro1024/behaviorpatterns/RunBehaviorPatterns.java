package com.genaro1024.behaviorpatterns;

import com.genaro1024.Util;
import com.genaro1024.behaviorpatterns.iterator.RunIterator;
import com.genaro1024.behaviorpatterns.pipeline.RunPipeline;
import com.genaro1024.behaviorpatterns.pipelinefunc.RunPipelineFunc;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RunBehaviorPatterns {

    private static List<Runnable> patterns = Arrays.asList(
        ()->RunIterator.Run()
        ,()->RunPipeline.Run()
        ,()->RunPipelineFunc.Run()
    );

    public static void Run(){
        System.out.println("################ BEHAVIOR PATTERNS ################");
        for (Runnable runnable : patterns) {
            runnable.run();
        }
    }
    public static String generateMenu(int start){
        List<String> menu = new ArrayList<String>();
        menu.add("BehaviorPatterns");
        menu.add(RunIterator.generateMenu());
        menu.add(RunPipeline.generateMenu());
        menu.add(RunPipelineFunc.generateMenu());
        String result = Util.indexMenu(menu, start);
        return result;
    } 
    public static HashMap<Integer,Runnable> getRunnable(int start){
        List<Runnable> runnable = new ArrayList<>();
        runnable.add(()->Run());
        for (Runnable pattern : patterns) {
            runnable.add(pattern);
        }
        HashMap<Integer,Runnable> result = Util.indexRunnable(runnable,start);
        return result;
    }       
}
