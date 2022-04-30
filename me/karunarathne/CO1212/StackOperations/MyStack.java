package me.karunarathne.CO1212.StackOperations;

import java.util.ArrayList;
import java.util.List;

public class MyStack <T> implements StackIn {
    List <Node <T>> baseList ;
    int pointer ;

    public MyStack() {
        baseList = new ArrayList<>() ;
        pointer = 0 ;
    }

    @Override
    public Object peek () {
        return null;
    }

    @Override
    public void push (Object element) {
        baseList.add ((T) element) ;
    }

    @Override
    public Object pop () {
        return null;
    }

    @Override
    public boolean isEmpty () {
        return pointer==0 ;
    }

    class Node <Y> {
        Y object ;

        public Node(Y object) {
            this.object = object;
        }

        public Y getObject() {
            return object;
        }
    }
}
