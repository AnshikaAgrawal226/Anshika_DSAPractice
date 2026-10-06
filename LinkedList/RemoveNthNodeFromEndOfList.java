package LinkedList;

public class RemoveNthNodeFromEndOfList {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Reverse the given linkedlist
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

        //Delete nth node
        ListNode temp = head;
        prev = null;
        int count =1;
        while(count<n){
            prev = temp;
            temp = temp.next;
            count++;
        }
        if(count==n){
            if(temp==head){
                head = head.next;
                temp = head;
            }
            else{
                prev.next = temp.next;
            }
            
        }

        //Reverse list again
        prev = null;
        curr = head;
        next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

        
    }
}
