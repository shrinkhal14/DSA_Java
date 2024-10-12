package Queue;

public class CircularQueue {
    
    static class queue {
        int front, rear, size;
        int[] arr;

       
        queue(int x) {
            front = 0;
            rear = 0;  
            size = x;
            arr = new int[size];
        }

        
        public boolean empty() {
            return front == rear;  
        }

       
        public boolean full() {
            return front == (rear + 1) % size;  
        }

        
        public void pushin(int x) {
            if (full()) {
                System.out.println("-1"); 
            } else {
                arr[rear] = x;           
                rear = (rear + 1) % size;  
            }
        }

        public int popfrm() {
            if (empty()) {
                System.out.println("-1");  
                return -1;
            } else {
                int x = arr[front];        
                front = (front + 1) % size; 
                return x;
            }
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);  
        q.pushin(1);
        q.pushin(2);
        q.pushin(3);
        
        
        System.out.println(q.popfrm());  
        System.out.println(q.popfrm());  
    }
}
