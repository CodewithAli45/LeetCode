package Medium;

import java.util.Stack;

public class Using2Stack {
    static class Queue {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        public boolean isEmpty() {
            if(st1.isEmpty()) {
                return true;
            }
            return false;
        }

        public void add(int data){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            st1.push(data);
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }

        public int remove() {
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return st1.pop();
        }

        public int peek() {
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return st1.peek();
        }

    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(25);
        q.add(36);
        q.add(123);
        q.add(143);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
