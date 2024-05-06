package com.genaro1024.behaviorpatterns.pipeline;

public class Pipeline<InputType, OutputType> {
    private final Handler<InputType,OutputType> currentHandler;

    public Pipeline(Handler<InputType, OutputType> handler){
        this.currentHandler=handler;
    }

    public <newOutputType> Pipeline<InputType, newOutputType> addHandler(Handler<OutputType, newOutputType> newHandler){
        return new Pipeline<>(input->newHandler.process(currentHandler.process(input)));
    }

    public OutputType execute (InputType input){
        return currentHandler.process(input);
    }

}
