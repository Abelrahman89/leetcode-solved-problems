package common.test;


import java.util.*;
public class MyQueue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public T pop() {
        if(!list.isEmpty()) {
            return list.removeFirst();
        }
        else {
            return null;
        }
    }

    public void push(T a) {
        list.addLast(a);
    }
}