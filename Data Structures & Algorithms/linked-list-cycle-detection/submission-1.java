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
        HashSet<ListNode> hs = new HashSet<>();
        if(head==null) return false;
        ListNode cur = head;

        while(cur.next!=null){
            if(!hs.add(cur)){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
}
