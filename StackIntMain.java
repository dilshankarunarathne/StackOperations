class StackIntMain1 {
    public static void main(String args[]) {
        StackInt s1 = new StackInt();

        s1.push(8);
        s1.push(5);
        s1.push(3);
        s1.push(1);
        s1.push(4);
        s1.push(2);

        System.out.println("Pop : " + s1.pop());
        System.out.println("Pop : " + s1.pop());

        s1.push(17);

        System.out.println("Pop : " + s1.pop());

        System.out.println("Is full : " + s1.isFull());
        System.out.println("Is empty : " + s1.isEmpty());

        System.out.println("Peek : " + s1.peek());
    }
}