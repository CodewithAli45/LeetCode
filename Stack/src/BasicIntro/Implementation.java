package BasicIntro;

public class Implementation {
   
    static class Node {
        int data;
        Node next;
        Node(int x){
            this.data = x;
            next = null;
        }
    }
    static class Stack {
        static Node head;
        public  boolean isEmpty(){
            return head == null;
        }
    
        public  void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public  int pop() {
            if(isEmpty()){
                return -1;
            }
    
            int top = head.data;
            head = head.next;
            return top;
        }

        public  int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    
    public static void main(String[] args) {
       Stack list = new Stack();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);

        while(!list.isEmpty()){
            System.out.println(list.peek());
            list.pop();
        }
    }
}
