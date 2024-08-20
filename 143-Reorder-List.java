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
    public void reorderList(ListNode head) {
        
        ListNode temp=head;
        ListNode t=null;
        int i=0;
        int f=0;
        if(head.next==null)
        {
         f=1;
        }
      else  if(head.next.next==null)
        {
        //   int v=head.next.val;
        //   int n=head.val;
        //   head.val=v;
        //   head.next.val=n;
           f=1;
        }
        if(f==0)
        {
        while(temp!=null)
        {
            i++;
            temp=temp.next;
        }
        temp=head;
        int count=0;
        
        while(temp!=null)
        {
            count++;
            if(i/2==count)
            {
          
                t=temp.next;
                t=reverse(t);
                    temp.next=null;
                    break;
            }
            temp=temp.next;
        }
        ListNode a=head;
        ListNode b=t;
         ListNode c=head.next;
        ListNode d=t.next;
        while(a!=null)
        {
        
        a.next=b;
        if(c!=null)
        b.next=c;
        a=c;
        b=d;
        if(c!=null)
        c=c.next;
        if(d!=null)
        d=d.next;
        }
        temp=head;
        }
        // if(b!=null)
        // {
        //    while(temp.next!=null)
        //    {
        //     temp=temp.next;
        //    }
        //    temp.next=new ListNode(b.val);
        // }
    }
    ListNode reverse(ListNode r)
    {
        ListNode prev=null,curr=r,next;
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