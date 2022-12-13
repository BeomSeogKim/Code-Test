package Study;

public class Stack {
    int top;
    int size;
    int [] stack;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        stack[++top] = item;
        System.out.println(stack[top] + "push");
    }

    public void pop() {
        System.out.println(stack[top] + "pop");
        int pop = stack[top];
        stack[pop--] = 0;
    }
    public void peek() {
        System.out.println(stack[top] + "peek");
    }
}

