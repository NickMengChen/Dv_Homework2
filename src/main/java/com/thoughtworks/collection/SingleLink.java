package com.thoughtworks.collection;

public interface SingleLink<T> {
    public void addTailbPointer(T item);         //添加尾指针
    public T getNode(int index);

}