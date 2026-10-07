package LinkedList;

public class LinkedListCycleII {
    //Definition for singly-linked list.
    
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
    public ListNode detectCycle(ListNode head) {
        //Firstly, detect the cycle
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                slow = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }

        }
        //if loop or cycle does not exist
        return null;

    }
}
