package LinkedList;

public class AddTwoNumbersII {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Reverse both given Linked lists 
        //Reversing list1
        ListNode prev = null;
        ListNode curr = l1;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        l1 = prev;

        //Reversing list2
        prev = null;
        curr = l2;
        next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        l2 = prev;

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode head =null;
        ListNode temp= null;
        int carry=0;
        while(temp1!=null && temp2!=null){
            ListNode node = new ListNode();
            if(head==null){
                head = node;
                temp = head;
            }
            else{
                temp.next = node;
                temp = node;
            }
            temp.val = (temp1.val+temp2.val+carry)%10;
            if((temp1.val+temp2.val+carry)/10>0){
                carry = (temp1.val+temp2.val+carry)/10;
            }
            else{
                carry = 0;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;

        }

        while(temp1!=null){
            ListNode node = new ListNode();
            if(head==null){
                head = node;
                temp = head;
            }
            else{
                temp.next = node;
                temp = node;
            }
            temp.val = (temp1.val+carry)%10;
            if((temp1.val+carry)/10>0){
                carry = (temp1.val+carry)/10;
            }
            else{
                carry = 0;
            }
            temp1 = temp1.next;

        }

        while(temp2!=null){
            ListNode node = new ListNode();
            if(head==null){
                head = node;
                temp = head;
            }
            else{
                temp.next = node;
                temp = node;
            }
            temp.val = (temp2.val+carry)%10;
            if((temp2.val+carry)/10>0){
                carry = (temp2.val+carry)/10;
            }
            else{
                carry = 0;
            }
            temp2 = temp2.next;

        }
        if(carry>0){
            ListNode node = new ListNode(carry);
            temp.next = node;
            temp = node;
        }

        //Reverse the obtained LinkedList
        prev = null;
        curr = head;
        next= null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;


    }
}
