package Questions;

class Node {
    int data;
    Node next;

    Node(int x){
        this.data = x;
        this.next = null;
    }
}
public class MiddleNode {
    public static int middleNode(Node head){
        if(head == null){
            return -1;
        }
        if(head.next == null){
            return head.data;
        }
        Node slowNode = head;
        Node fastNode = head;
        while(fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        return slowNode.data;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        // head.next.next.next.next = new Node(5);

        int ans = middleNode(head);
        System.out.println(ans);
    }
}
