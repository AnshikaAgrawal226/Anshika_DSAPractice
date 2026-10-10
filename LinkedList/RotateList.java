package LinkedList;

public class RotateList {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null|| head.next==null|| k==0){
            return head;
        }
        ListNode temp = head;
        int length= 1;
        while(temp.next!=null){
            temp = temp.next;
            length++;
        }
        ListNode last = temp;
        int r = k % length;
        if(r==0){
            return head;
        }
        int rotate = (length-r)+1;

        temp = head;
        ListNode prev = null;
        int pos =1;
        while(pos!=rotate){
            prev = temp;
            temp = temp.next;
            pos++;
        }
        last.next = head;
        prev.next = null;
        head = temp;
        return head;
    }
}
