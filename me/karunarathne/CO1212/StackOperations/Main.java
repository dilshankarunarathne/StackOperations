package me.karunarathne.CO1212.StackOperations;

public class Main {
    public static void main(String[] args) {
        StackIn myStack = new MyStack() ;
        myStack.push(8);
        myStack.push(5);
        myStack.push(3);
        myStack.push(1);
        myStack.push(4);
        myStack.push(2);

        System.out.println("Pop : " + myStack.pop());
        System.out.println("Pop : " + myStack.pop());

        myStack.push(17);

        System.out.println("Pop : " + myStack.pop());

        System.out.println("Is empty : " + myStack.isEmpty());

        System.out.println("Peek : " + myStack.peek());
    }
}
