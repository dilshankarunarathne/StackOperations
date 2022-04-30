package me.karunarathne.CO1212.StackOperations;

public interface StackIn {
    public int peek () ;

    // Insert elements
    public void push(int element) ;

    // Remove elements
    public int pop() ;

    // Check whether the stack is full
    public boolean isFull() ;

    // Check whether the stack is empty
    public boolean isEmpty() {
        return pointer == 0 ;
    }
}
