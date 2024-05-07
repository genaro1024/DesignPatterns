package com.genaro1024;

import java.util.HashMap;
import java.util.List;

public class Util {
    public static String indexMenu(List<String> menu,int start)
    {
        String result = "";
        for(int i=0;i<menu.size();i++){
            int index = start + i;
            result+=index+"."+menu.get(i)+" ";
        }
        return result;
    }
    public static HashMap<Integer,Runnable> indexRunnable(List<Runnable> runnable,int start)
    {
        HashMap<Integer,Runnable> result= new HashMap<>();
        for(int i=0;i<runnable.size();i++){
            int index = start + i;
            result.put(index, runnable.get(i));
        }
        return result;
    }    
}
