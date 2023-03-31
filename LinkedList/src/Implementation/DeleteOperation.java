package Implementation;

public class DeleteOperation {
    Node head;
    private int size;

    DeleteOperation(){
        this.size = 0;
    }
    class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add operation

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node cuNode = head;
        while(cuNode.next != null){
            cuNode = cuNode.next;
        }

        cuNode.next = newNode;
    }

    // delete operation

    public void deleteFirst(){
        if(head == null){
            System.out.println("empty list ");
            return;
        }
        size--;
        
        if(head.next == null){
            head = null;
            System.out.println("only head was present   ");
            return;
        }

        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            System.out.println("only head was present   ");
            return;
        }

        Node secondNode = head;
        Node  lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondNode = secondNode.next;
        }
        secondNode.next = null;
    }

    public int getSize(){
        return size;
    }
    


    // display 
    public void display() {
        if(head == null){
            System.out.println("Empty node");
            return;
        }
        Node cuNode = head;
        while(cuNode != null){
            System.out.print(cuNode.data +" -> ");
            cuNode = cuNode.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        DeleteOperation list =new DeleteOperation();
        list.addLast("We");
        list.addLast("are");
        list.addLast("Linked List");
        list.addLast("Learning");
        list.display();

        // list.deleteFirst();
        list.deleteLast();
        list.display();
        System.out.println(list.getSize());
    }
}
