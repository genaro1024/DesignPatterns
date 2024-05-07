package com.genaro1024.creationpatterns.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper=true, includeFieldNames=true)
@Getter
@Setter
public class Circle extends Shape {

    private int radius;

    public Circle(){}

    public Circle(Circle circle){
        super(circle);
        if(circle!=null){
            this.radius=circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

}
