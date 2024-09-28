import java.util.Stack;

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
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;  
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
      
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
       
        Stack<Integer> rev = new Stack<>();
        
        
        ListNode curr = slow;
        while (curr != null) {
            rev.push(curr.val);
            curr = curr.next; 
        }
        
        
        curr = head;
        while (!rev.isEmpty()) {
            if (rev.pop() != curr.val) {  
                return false; 
            }
            curr = curr.next;
        }
        
        return true; 
    }
}
