/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        ListNode h =head;
        ListNode t = head;
        while(t!=null && t.next!=null){
           h= h.next;
           t = t.next.next; 
        }
        ListNode curr = h.next;
        if(curr==null){
            return;
        }


       h.next=null;
       ListNode prev = null;

       ListNode currtemp = curr.next;
       while(curr.next !=null){
        curr.next = prev;
        prev = curr;
        curr = currtemp;
          currtemp = currtemp.next;
       }
curr.next = prev;
ListNode first=head.next;
ListNode second=curr.next;
head.next =curr;
curr.next =first;
while(second!=null){
    curr =curr.next;
    first =first.next;
curr.next =second;
second =second.next;
curr =curr.next;
curr.next=first;
}
        }
        
    }

