package Queue;

public class ArrayImplement {

    static class Queue {
        int front, rear, size;
        int[] queue;

        //Constructor to initialize the queue
        Queue(int x) {
            front = 0;
            rear = -1;
            size = x;
            queue = new int[size];
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return (rear < front);
        }

        // Check if the queue is full
        public boolean isFull() {
            return (rear == size - 1);
        }

        //enqueue
        public void add(int x) {
            if (!isFull()) {
                rear++;
                queue[rear] = x;
                System.out.println(x + " enqueued to the queue.");
            } else {
                System.out.println("Queue is full.");
            }
        }

        //dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            } else {
                int f = queue[front];
                System.out.println(f + " dequeued from the queue.");
                front++;
                return f;
            }
        }

        //peek
        public int look() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            } else {
                return queue[front];
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);  
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println("Front element: " + q.look());
            q.remove();
        }

        //try to remove from empty queue
        q.remove();
    }
}
