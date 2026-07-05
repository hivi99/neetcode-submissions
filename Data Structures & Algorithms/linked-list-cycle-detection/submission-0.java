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
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode h = head;
       ListNode t= head.next.next;
        
        while(t!=null && t.next!=null && h!=t){
            h = h.next;
            t = t.next.next;
        }
        if(h==t){
            System.out.println("cycle exists");
            return true;
        }
        else {
            System.out.println("cycle does not exist");
            return false;
        }
        }   
    }
    

