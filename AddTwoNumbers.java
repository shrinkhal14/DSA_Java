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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(l1!=null || l2!=null){
            int x=0;
            int y=0;
            if(l1!=null){
                x=l1.val;
                l1=l1.next;
            }
            else{
                x=0;
            }
            if(l2!=null){
                y=l2.val;
                l2=l2.next;
            }
            else{
                y=0;
            }
            int sum = carry+x+y;
            carry = sum/10;
            curr.next =  new ListNode(sum%10);
            curr=curr.next;
        }
        if(carry>0){
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
