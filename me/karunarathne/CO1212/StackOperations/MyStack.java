package me.karunarathne.CO1212.StackOperations;

import java.util.ArrayList;
import java.util.List;

public class MyStack <T> {
    List <Node <T>> baseList ;
    int pointer ;

    public MyStack() {
        baseList = new ArrayList<>() ;
        pointer = 0 ;
    }

    class Node <T> {
        T object ;

        public Node(T object) {
            this.object = object;
        }

        public T getObject() {
            return object;
        }
    }
}
