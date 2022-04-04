# StackOperations
Download this two java files and implement the methods which are mentioned inside
the class. Just use the basic things that I have taught you in the lectures.  
In the next lectures you will be asked to share and explain the codes.

## Interface to implement

    // Insert elements
    public void push(int element) {
        myStack [pointer] = element ;
		pointer ++ ;
    }

    // Remove elements
    public int pop() {
		pointer -- ;
		return myStack [pointer+1] ;
    }

    // Check whether the stack is full
    public boolean isFull() {
        return pointer == 1000 ;
    }

    // Check whether the stack is empty
    public boolean isEmpty() {
        return pointer == 0 ;
    }
