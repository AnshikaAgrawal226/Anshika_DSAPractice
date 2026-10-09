
package LinkedList;
public class OddEvanLinkedList {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode oddEvenList(ListNode head) {
        //if(head==null){
          //  return null;
        //}
        ListNode headodd = new ListNode(0);
        ListNode headeven = new ListNode(0);
        ListNode tailodd = headodd;
        ListNode taileven = headeven;
        ListNode temp = head;
        int count =1;
        while(temp!=null){
            if(count%2==0){
                taileven.next = temp;
                taileven = taileven.next;
            }
            else{
                tailodd.next = temp;
                tailodd= tailodd.next;
            }
            temp = temp.next;
            count++;
        }
        if(headeven.next!=null){
            tailodd.next = headeven.next;
        }
        
        taileven.next = null;
        return headodd.next;
    }
}
