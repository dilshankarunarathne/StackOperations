package me.karunarathne.CO1212.StackOperations;

import java.util.ArrayList;
import java.util.List;

public class MyStack <T> implements StackIn {
    List <T> baseList ;
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
        return (T) (baseList.get (pointer)) ;
    }

    @Override
    public boolean isEmpty () {
        return pointer==0 ;
    }
}
