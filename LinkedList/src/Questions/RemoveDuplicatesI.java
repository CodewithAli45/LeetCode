package Questions;

class Node {
    int data;
    Node next;
    Node(int x){
        this.data = x;
        next = null;
    }
}

public class RemoveDuplicatesI {
    public Node removeDuplicates(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        Node currNode = head;
        while(currNode.next != null){
            if(currNode.data == currNode.next.data){
                currNode.next = currNode.next.next;
            } else {
                currNode =currNode.next;
            }
        }

        return head;

    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);

        RemoveDuplicatesI solution = new RemoveDuplicatesI();
        Node listNode = solution.removeDuplicates(head);

        while(listNode != null){
            System.out.print(listNode.data + " ");
            listNode = listNode.next;
        }
    }
}
