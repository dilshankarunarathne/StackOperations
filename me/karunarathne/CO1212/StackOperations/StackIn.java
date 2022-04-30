package me.karunarathne.CO1212.StackOperations;

public interface StackIn <T> {
    public T peek () ;

    public void push (int element) ;

    public int pop () ;

    public boolean isFull () ;

    public boolean isEmpty () ;
}
