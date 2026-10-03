package LinkedList;

public class MergeTwoSortedLists {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode head = null;
       ListNode prev = null;
       ListNode l1 = list1;
       ListNode l2 = list2;
       while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                ListNode l = new ListNode(l1.val);
                //l.val = l1.val;
                l1= l1.next;
                if(head==null){
                    head = l;
                }
                if(prev!=null){
                    prev.next = l;
                }
                
                prev = l;

            }
            else{
                ListNode l= new ListNode(l2.val);
                //l.val=l2.val;
                l2= l2.next;
                if(head==null){
                    head = l;
                }
                if(prev!=null){
                    prev.next = l;
                }
                
                prev = l;
            }
        
        }
        while(l2!=null){
            ListNode l = new ListNode(l2.val);
            //l.val = l2.val;
            l2=l2.next;
            if(head==null){
                head = l;
            }
            if(prev!=null){
                prev.next = l;
            }
                
            prev = l;
        }

        while(l1!=null){
            ListNode l = new ListNode(l1.val);
            //l.val = l1.val;
            l1=l1.next;
            if(head==null){
                head = l;
            }
            if(prev!=null){
                prev.next = l;
            }
                
            prev = l;
        }
        return head;

    }
}
