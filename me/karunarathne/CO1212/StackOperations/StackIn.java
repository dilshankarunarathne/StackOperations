package me.karunarathne.CO1212.StackOperations;

public interface StackIn <T> {
    public T peek () ;

    public void push (T element) ;

    public T pop () ;

    public boolean isFull () ;

    public boolean isEmpty () ;
}
