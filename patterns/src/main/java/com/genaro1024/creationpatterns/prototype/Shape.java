package com.genaro1024.creationpatterns.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape(){}

    public Shape(Shape shape){
        if(shape != null){
            this.x = shape.x;
            this.y = shape.y;
            this.color=shape.color;
        }
    }
    
    public abstract Shape clone();

}
