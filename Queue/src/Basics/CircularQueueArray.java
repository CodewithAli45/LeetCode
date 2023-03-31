package Basics;

public class CircularQueueArray {
    static class Queue {
        static int [] arr;
        static int size;
        static int rear = -1, front = -1;

        Queue(int n){
            arr = new int[n];
            Queue.size = n;
        }
        // is empty
        public boolean isEmpty() {
            if(rear == -1 && front == -1){
                return true;
            }
            return false;
        }
        // is Full {
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add O-1
        public void add(int data) {
            if(isFull()){
                System.out.println("Full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
            // System.out.print(arr[rear] + " ");
        }

        // remove 
        public int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return - 1;
            }
            int res = arr[front];
            if(rear == front){
                rear = front = -1;
            } else {
                front = (front + 1)% size;
            }
            return res;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return - 1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(5);
        q.add(9);
        q.add(12);
        q.add(15);
        q.add(20);
        q.remove();
        q.add(26);
        q.remove();
        q.add(78);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
        
    }
    
}
