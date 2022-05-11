Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,1,2]
Output: [1,2]



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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
       ListNode currentNode=head,lastNode=head.next;
        while(lastNode!=null){
            if(currentNode.val==lastNode.val){
                currentNode.next=lastNode.next;
            }
            else{
                currentNode=currentNode.next;
            }
            lastNode=lastNode.next;
        }
        return head;
    }
}
