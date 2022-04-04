class StackInt {
    int top = -1;
    int limit = 1000;
    int [] myStack ;

	private int pointer ;

	public StackInt () {
		myStack[] = new int[limit];
		pointer = 0 ;
	}

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
}