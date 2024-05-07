package com.genaro1024.creationpatterns;

import com.genaro1024.Util;
import com.genaro1024.creationpatterns.prototype.RunPrototype;
import com.genaro1024.creationpatterns.singleton.RunSingleton;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RunCreationPatterns {
    private static List<Runnable> patterns = Arrays.asList(
        ()->RunSingleton.Run()
        ,()->RunPrototype.Run()
    );
    
    public static void Run(){
        System.out.println("################ CREATION PATTERNS ################");
        for (Runnable runnable : patterns) {
            runnable.run();
        }
    }
    public static String generateMenu(int start){
        List<String> menu = new ArrayList<String>();
        menu.add("CreationPatterns");
        menu.add(RunSingleton.generateMenu());
        menu.add(RunPrototype.generateMenu());
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
