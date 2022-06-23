package stacks;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    public Stack(int size) {
        this.arr = new int[size];
        this.capacity = size;
        this.top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow\n Program Terminated");
            return;
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            System.exit(1);
        }
        return arr[top--];
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
}