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
        ListNode dummy = new ListNode();
        ListNode res =  dummy;
        int count = 0, carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            count = carry;
            if(l1 != null){
                count += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                count += l2.val;
                l2 = l2.next;
            }
            int num = count % 10;
             carry = count / 10;
            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }
        return res.next;
    }
}