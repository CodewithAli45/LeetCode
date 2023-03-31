package Basic;
// import java.util.*;
class Node {
    Node next;
    int data;
    Node(int x) {
        this.next = null;
        this.data = x;
    }
}
public class ReverseList {
    
    public Node reverseList(Node head){
        if(head == null || head.next == null){
            return null;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        return head;
    }
    public static void main(String[] args) {
       Node list = new Node(1);
       list.next = new Node(2);
       list.next.next = new Node(3);
       ReverseList sol = new ReverseList();

       Node listHead = sol.reverseList(list);
       while(listHead != null){
        System.out.print(listHead.data + " ");
        listHead = listHead.next;
       }
    }
}
