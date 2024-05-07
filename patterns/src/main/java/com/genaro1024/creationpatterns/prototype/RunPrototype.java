package com.genaro1024.creationpatterns.prototype;

public class RunPrototype {
    public static void Run(){
        System.out.println("##################### PROTOTYPE ################@####");
        Circle circle01 = new Circle();
        circle01.setRadius(10);
        circle01.setColor("BLACK");
        circle01.setX(0);
        circle01.setY(0);
        System.out.println("circle01:"+ circle01.toString());
        Circle circle02 = (Circle)circle01.clone();
        System.out.println("circle02:"+ circle02.toString());
        circle02.setRadius(11);
        System.out.println("circle01:"+ circle01.toString());
        System.out.println("circle02:"+ circle02.toString());
    }

    public static String generateMenu(){
        return "Prototype";
    }
}
