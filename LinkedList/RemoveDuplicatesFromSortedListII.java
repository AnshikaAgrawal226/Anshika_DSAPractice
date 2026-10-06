package LinkedList;

public class RemoveDuplicatesFromSortedListII {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode prev= null;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                int value = temp.val;
                if(temp==head){
                    while(temp!=null && temp.val==value){
                        head = head.next;
                        temp = head;
                    }
                    
                }
                else{
                    while(temp!=null && temp.val==value){
                        prev.next = temp.next;
                        temp = temp.next;
                    }
                }
                
                
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}
