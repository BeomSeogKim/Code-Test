package Study;

public class ArrayQueue {
    int rear;
    int[] queue;
    int queueSize;

    public ArrayQueue(int size) {
        this.rear = 0;
        this.queue = new int[size];
        this.queueSize = size;
    }

    // Check Empty
    public boolean isEmpty() {
        return rear == 0;
    }

    // Check Full
    public boolean isFull() {
        return (rear == this.queueSize - 1);
    }

    public void enqueue(int number) {
        if (isFull()) {
            System.out.println("[Warning] Queue is Full");
        } else {
            queue[rear++] = number;
            System.out.println("Inserted Number = " + number);
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("[Warning] Queue is Empty");
        } else {
            int[] tmpQueue = queue.clone();
            System.out.println("Deleted Number = " + tmpQueue[0]);
            for (int i = 0; i < queue.length - 1; i++) {
                queue[i] = tmpQueue[i + 1];
            }
            rear--;
        }
    }

    public void peek() {
        System.out.println("Queue : " + queue[0]);
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.dequeue();
        arrayQueue.enqueue(1);
        arrayQueue.peek();
        arrayQueue.enqueue(8);
        arrayQueue.peek();
        arrayQueue.dequeue();
        arrayQueue.peek();
        arrayQueue.dequeue();
        arrayQueue.peek();
        arrayQueue.dequeue();
    }

}
