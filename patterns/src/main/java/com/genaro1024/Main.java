package com.genaro1024;

import com.genaro1024.creationpatterns.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("################ CREATION PATTERNS ################");
        System.out.println("#################### SINGLETON ####################");
        Singleton singleton01 = Singleton.getInstance("value01");
        Singleton singleton02 = Singleton.getInstance("value02");
        System.out.println("singleton01:"+singleton01.getValue());
        System.out.println("singleton02:"+singleton02.getValue());
        System.out.println("##################### BUILDER ################@####");


    }
}