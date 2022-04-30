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
    public T peek () {
        return (T) (baseList.get (pointer)) ;
    }

    @Override
    public void push (Object element) {
        baseList.add (new Node<T>((T) element)) ;
        pointer ++ ;
    }

    @Override
    public Object pop () {
        pointer -- ;
        return baseList.get (pointer) ;
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
