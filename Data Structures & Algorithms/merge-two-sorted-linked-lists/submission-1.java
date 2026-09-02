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
        ListNode dummy = new ListNode(0);
        ListNode dummyHead = dummy;

        while(list1!=null && list2!=null){
            int x1 = list1.val;
            int x2 = list2.val;

            if(x1<x2){
                dummyHead.next=list1;
                list1=list1.next;
            }
            else{
                dummyHead.next=list2;
                list2=list2.next;
            }

            dummyHead=dummyHead.next;
        }
       if(list1==null) dummyHead.next = list2;
       else dummyHead.next = list1;

        return dummy.next;
    }
}