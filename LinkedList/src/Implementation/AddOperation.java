package Implementation;

public class AddOperation {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // adding operation
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode; 
            return;
        }
        newNode.next = head;
        head =newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node curNode = head;
        while(curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    // display 
    public void display() {
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.print("null");
    }
    public static void main(String[] args) {
        AddOperation list = new AddOperation();
        // list.addFirst("ali");
        // list.addFirst("structure");
        // list.display();

        list.addLast("list");
        list.addLast("a");
        list.addLast("is");
        list.addLast("this");
        list.display();

    }
}
