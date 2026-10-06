package LinkedList;
public class RemoveNodesFromLinkedList {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNodes(ListNode head) {
        //Firstly,reverse the given linkedlist
        ListNode prev = null;
        ListNode curr =head;
        ListNode next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

        //Now, remove the nodes
        ListNode temp = head.next;
        prev = head;
        int max = head.val;
        while(temp!=null){
            if(temp.val<max){
                prev.next = temp.next;
                
            }
            else{
                max = temp.val;
                prev = temp;
            }
            temp= temp.next;

        }

        //Again, reverse the obtained linkedlist
        curr = head;
        prev = null;
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
