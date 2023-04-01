package Questions;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
        next = null;
    }
}

public class MergeTwoList {
    public static ListNode mergeTwoList(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if(list1 == null){
            current.next = list2;
        } else {
            current.next = list1;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(5);

        // MergeTwoList sol = new MergeTwoList();
        ListNode newHead = mergeTwoList(list1, list2);

        while(newHead != null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
