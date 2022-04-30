package me.karunarathne.CO1212.StackOperations;

public interface StackIn {
    public int peek () ;

    // Insert elements
    public void push(int element) {
        myStack [pointer] = element ;
        pointer ++ ;
    }

    // Remove elements
    public int pop() {
        pointer -- ;
        return myStack [pointer] ;
    }

    // Check whether the stack is full
    public boolean isFull() {
        return pointer == 1000 ;
    }

    // Check whether the stack is empty
    public boolean isEmpty() {
        return pointer == 0 ;
    }
}
