package Implementation;

public class ReverseDoublyLL {
    static class Node {
        Node prev;
        Node next;
        int data;
        Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    Node head;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;

        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        newNode.prev = lastNode;
    }

    public void reverse(){
        Node current = head;
        Node temp = null;
        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if(temp != null){
            head = temp.prev;
        }

    }
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ReverseDoublyLL dll = new ReverseDoublyLL();
        dll.addNode(1);
        dll.addNode(2);
        dll.addNode(3);
        dll.addNode(4);
        dll.addNode(5);
        
        dll.display();
        dll.reverse();
        dll.display();
    }
}
