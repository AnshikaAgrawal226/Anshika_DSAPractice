package LinkedList;
public class PalindromeLinkedList {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        //First, find the middle element
        ListNode slow = head;
        ListNode fast = head;
        if(head==null){
            return false;
        }
        else if(head.next==null){
            return true;
        }
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //Now Node slow is the middle element of the linkedlist at this point
        //Now we will reverse the list after the middle element
        ListNode curr = slow.next;
        ListNode prev = null;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //head of the second half (reversed LL) will be prev Node
        ListNode temp1 = head;
        ListNode temp2 = prev;
        while(temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
}
