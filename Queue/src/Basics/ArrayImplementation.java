package Basics;

public class ArrayImplementation {
    static class Queue {
        static int[] arr;
        static int rear = -1;
        int size;

        Queue(int n) {
            arr = new int [n];
            this.size = n;
        }
        // is emoty quque 
        public static boolean isEmpty(){
            return rear == -1;
        }

        // enque
        public void  add(int data){
            if(rear == size - 1){
                System.out.println("full");
            }
            rear++;
            arr[rear] = data;
            System.out.print(arr[rear] + " ");
        }

        // remove or dequeue
        public int remove(){
            if(isEmpty()){
                System.out.println("empty Queue");
                return -1;
            }

            int front = arr[0];
            for(int i = 0; i < rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        // peek

        public int peek() {
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5); 
        q.add(2);
        q.add(5);
        q.add(8);
        System.out.println(q.remove());
        System.out.println(q.peek());
        
    }
}
