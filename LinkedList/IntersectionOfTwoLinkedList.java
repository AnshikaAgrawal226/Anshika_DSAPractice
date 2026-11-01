package LinkedList;

public class IntersectionOfTwoLinkedList {
    //Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode tempa = headA;
        ListNode tempb = headB;
        if(tempa==tempb){
            return tempa;
        }
        while(tempa!=null && tempb!=null){
            
            tempa= tempa.next;
            tempb = tempb.next;
            if(tempa==tempb){
                return tempa;
            }
            if(tempa==null){
                tempa = headB;
            }
            if(tempb==null){
                tempb = headA;
            }
            if(tempa==tempb){
                return tempa;
            }
        }
        return null;
    }
}
