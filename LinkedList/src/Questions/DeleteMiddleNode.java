package Questions;

class Node {
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class DeleteMiddleNode {
    public static Node deleteMiddleNode(Node head){
        if(head == null){
            System.out.println("Empty list");
            return null;
        }
        if(head.next ==null){
            return head;
        }
        Node prevNode = null;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            prevNode = slow;
            fast = fast.next.next;
            slow = slow.next;
        } 
        prevNode.next = slow.next;
        return head;
    }
    public static void main(String[] args) {
       Node head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(5);

       Node list = deleteMiddleNode(head);
       while(list != null){
        System.out.print(list.data + " ");
        list = list.next;
       }
    }
}
