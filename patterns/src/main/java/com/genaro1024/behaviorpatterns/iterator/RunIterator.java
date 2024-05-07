package com.genaro1024.behaviorpatterns.iterator;

public class RunIterator {
    public static void Run(){
        System.out.println("#################### ITERATOR #####################");
        Box box = new Box(new String[]{"Hello", "World", "Car", "Box", "Dog", "Cat"});
        while(box.hasNext()){
            int position = box.getCurrentPosition();
            String text = box.getNext();
            System.out.println("Item"+position+":"+ text);
        }
    }
}
