package com.genaro1024.behaviorpatterns.pipeline;

public interface Handler<InputType, OutputType> {
    public OutputType process(InputType input);
}
