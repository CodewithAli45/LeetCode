package Questions;
class Node {
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}


public class DeleteNthNode {

    public Node deleteNode(Node head, int n){
        if(head == null){
            System.out.println("Empty list");
            return null;
        }
        if(head.next == null){
            System.out.println("Only head was present");
            return head.next;
        }
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node slowNode = dummyNode;
        Node fastNode = dummyNode;

        for(int i = 1; i <= n+1; i++){
            fastNode = fastNode.next;
        }
        while(fastNode != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }

        slowNode.next = slowNode.next.next;
        return dummyNode.next;
    }

    public static void main(String[] args) {
       Node head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(5);
       int n = 2;

       DeleteNthNode sol = new DeleteNthNode();
       Node listHead = sol.deleteNode(head, n);
       while(listHead != null){
        System.out.print(listHead.data + " ");
        listHead = listHead.next;
       }
    
    }
}
