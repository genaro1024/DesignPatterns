package com.genaro1024.behaviorpatterns.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T getNext();
    void reset();
}
