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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode a=null;
        ListNode t=head;
        int c=0;
        ListNode vi=null;
        ListNode main=null;
        ListNode m=head;
        int i=0;
       while(t!=null)
       {
       c++;
       if(c==k)
       {
        if(i==0)
        {
        ListNode f=t;
        t=t.next;
        f.next=null;
        ListNode r=reverse(m);
        m=r;
        main=r;
        while(r!=null)
        {
            r=r.next;
        }
        vi=t;
        i++;
        c=0;
        }
        else
        {
            while(m.next!=null)
            {
                m=m.next;
            }
          
            ListNode s=t;
            t=t.next;
            s.next=null;
             ListNode r=reverse(vi);
             m.next=r;
             vi=t;
              while(r!=null)
        {
            r=r.next;
        }
             c=0;
        }
       }
       if(t!=null && c!=0)
       t=t.next;
       }
       if(c>0)
       {
        while(m.next!=null)
        {
            m=m.next;
        }
        m.next=vi;
       }

        return main;
    }
    ListNode reverse(ListNode head)
    {
        ListNode prev=null,curr=head,next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}