package Questions;


class Node {
    int data;
    Node next;

    Node(int x){
        this.data = x;
        this.next = null;
    }
}

public class ReverseLL {

    public static Node reverseList(Node head){
        Node prevNode = null;
        Node currNode = head;

        while(currNode != null){
            Node tempNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = tempNode;
        }

        return prevNode;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        Node list = reverseList(head);
        while(list != null){
            System.out.print(list.data + " ");
            list = list.next;
        }

    }
}
