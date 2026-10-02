package LinkedList;

public class RemoveLinkedListElements {
       
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp= head;
        ListNode prev = head;

        while(temp!=null){
            if(temp.val==val){
                if(temp ==head){
                    temp = temp.next;
                    prev = prev.next;
                    head = temp;
                    continue;
                }
                prev.next = temp.next;
                temp= temp.next;
                continue;
            }
            prev = temp;
            temp = temp.next;
        }
        if(prev!=null && prev.val==val){
            head = null;
        }
        return head;
    }
}
