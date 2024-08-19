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
    public ListNode swapPairs(ListNode head) {
       if(head==null)
       return null;
         if(head.next==null)
         return head;
         if(head.next.next==null)
         {
            ListNode a=head;
            ListNode b=head.next;
            b.next=a;
            a.next=null;
            return b;
         }
         if(head.next.next.next==null)
         {
            ListNode temp=null;
            temp=head.next;
            int v=head.val;
            head.val=temp.val;
             temp.val=v;
            return head;
         }
         ListNode temp=head;
            ListNode c=head.next.next;
            ListNode r=null;
            ListNode q=null;
            int l=0;
            int val=0;
         while(c!=null )
         {
           
           temp=head.next;
            if(l==0)
            {
            r=temp;
            }
          if(c.next==null)
          break;
           c=temp.next;
            temp.next=head;
            head.next=c; 
            if(l!=0)
            q.next=temp;
            temp=temp.next;
            head=head.next;
           q=temp;
           l++;
           val++;
         }
         return r;
    }
}