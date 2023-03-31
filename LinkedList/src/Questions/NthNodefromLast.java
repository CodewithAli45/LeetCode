package Questions;

class Node {
    int data;
    Node next;

    Node(int x){
        this.data = x;
        this.next = null;
    }
}

public class NthNodefromLast {

    public static int nthNodeFromLast(Node head, int n){
        if(head == null){
            return -1;
        }
        Node slowNode = head;
        Node fastNode = head;
        for(int i = 1; i < n + 1; i++){
            if(fastNode == null){
                return -1;
            }
            fastNode = fastNode.next;
        }
        while(fastNode != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }
        return slowNode.data;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int n = 2;

        int ans = nthNodeFromLast(head, n);
        System.out.println(ans);
    }
}
