package LinkedList;

public class ReverseLinkedListII {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        ListNode pre=null;
        int pos = 1;
        while(pos<left){
            pre = temp;
            temp= temp.next;
            pos++; 
        }
        ListNode curr = temp;
        ListNode prev=null;
        ListNode next = null;
        while(pos<=right){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            pos++;
        }
        if(pre!=null){
            pre.next = prev;
        }
        
        temp.next = curr;
        if(left==1){
            return prev;
        }
        return head;
    }
}
