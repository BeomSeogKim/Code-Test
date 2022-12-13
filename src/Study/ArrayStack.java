package Study;

public class ArrayStack {
    int top;
    int size;
    int[] stack;

    public ArrayStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        stack[++top] = item;
        System.out.println(stack[top] + " push");
    }

    public void pop() {
        System.out.println(stack[top] + "pop");
        int pop = stack[top];
        stack[top--] = 0;
    }

    public void peek() {
        System.out.println(stack[top] + "peek");
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(1);
        arrayStack.push(5);
        arrayStack.push(9);
        arrayStack.peek();
        arrayStack.pop();
        arrayStack.peek();
        arrayStack.pop();
    }
}

