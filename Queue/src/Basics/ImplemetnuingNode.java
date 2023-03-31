package Basics;

public class ImplemetnuingNode {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public boolean isEmplty(){
            return head == null && tail ==null;
        }
        public void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }
        public int remove(){
            if(isEmplty()){
                System.out.println("empty");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                tail = null;
            }

            head = head.next;
            return front;
        }

        public int peek() {
            if(isEmplty()){
                System.out.println("empty");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(25);
        q.add(35);
        q.add(45);

        while(!q.isEmplty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
