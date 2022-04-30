class StackInt {
    int limit = 1000;
    int [] myStack ;

	private int pointer ;

	public StackInt () {
		myStack = new int[limit];
		pointer = 0 ;
	}

    public int peek () {
        int value = myStack [-- pointer] ;
        pointer ++ ;
        return value ;
    }

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