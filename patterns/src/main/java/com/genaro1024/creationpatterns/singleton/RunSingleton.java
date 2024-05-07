package com.genaro1024.creationpatterns.singleton;

public class RunSingleton {
    public static void Run(){
        System.out.println("#################### SINGLETON ####################");
        Singleton singleton01 = Singleton.getInstance("value01");
        Singleton singleton02 = Singleton.getInstance("value02");
        System.out.println("singleton01:"+singleton01.getValue());
        System.out.println("singleton02:"+singleton02.getValue());        
    }

    public static String generateMenu(){
        return "Singleton";
    }  
}
