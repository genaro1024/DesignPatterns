package com.genaro1024.behaviorpatterns.iterator;


public class Box implements Iterator<String> {

    private int currentPosition = 0;
    private String[] content;

    public Box(String[] content){
        this.content=content;
    }
    
    @Override
    public String getNext() {
        String item = content[currentPosition];
        currentPosition++;
        return item;
    }

    @Override
    public boolean hasNext() {
        if(currentPosition<content.length-1)
            return true;
        return false;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }

}
