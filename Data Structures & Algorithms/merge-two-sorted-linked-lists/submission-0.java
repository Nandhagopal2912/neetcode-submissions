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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode dummyHead = dummy;
        dummyHead.val =0;

        ListNode l1 = list1;
        ListNode l2 = list2;

        while(l1!=null && l2!=null){
            int x1 = l1.val;
            int x2 = l2.val;

            if(x1<x2){
                dummyHead.next=l1;
                l1=l1.next;
            }
            else{
                dummyHead.next=l2;
                l2=l2.next;
            }

            dummyHead=dummyHead.next;
        }
        dummyHead.next = (l1==null)?l2:l1;

        return dummy.next;
    }
}