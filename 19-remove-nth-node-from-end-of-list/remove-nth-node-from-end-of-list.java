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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int s=0;
        ListNode temp = head;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        if(n==s) return head.next;
        ListNode t = head;
        int r = s-n;
        for(int i=0;i<r-1;i++){
            t=t.next;
        }
        t.next=t.next.next;
        return head;

    }
}