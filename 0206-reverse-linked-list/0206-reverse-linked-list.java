import java.util.*;
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

    //next 자료형 ListNode
    public ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode link = null;

        if(p==null)
            return p;
            
        while(p!=null){
            ListNode headPointer = p.next;
            p.next=link;
            link=p;
            p=headPointer;
        }
        
        return link;

        // ListNode p = new ListNode(3,null);
        // p.next=new ListNode(4,null);
        // p.next=new ListNode(5,null);


    }

}