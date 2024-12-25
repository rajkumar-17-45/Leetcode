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
    public ListNode mergeTwoLists(ListNode l, ListNode l2) {
        
        ListNode res=null;
        ListNode k=null;
        int i=0;
        while(l!=null && l2!=null)
        {
            if(l.val<l2.val)
            {
                // System.out.println("heeloo"+" "+i);
                if(res==null)
                {
                  
                    res=new ListNode(l.val);
                      k=res;
                }
                else
                {
                    ListNode add=new ListNode(l.val);
                     res.next=add;
                     res=res.next;
                }
                l=l.next;
            }
            else if(l.val>=l2.val)
            {
                if(res==null)
                {
                    res=new ListNode(l2.val);
                     k=res;
                }
                else
                {
                    ListNode add=new ListNode(l2.val);
                     res.next=add;
                     res=res.next;
                }
                l2=l2.next;
            }
            i++;
        }
        while(l!=null)
        {
            if(res==null)
            {
            ListNode val=new ListNode(l.val);
            res=val;
            k=res;
            }
            else
            {
            ListNode val=new ListNode(l.val);
            res.next=val;
            res=res.next;
            }
            l=l.next;
        }
        while(l2!=null)
        {
             if(res==null)
            {
            ListNode val=new ListNode(l2.val);
            res=val;
            k=res;
            }
            else
            {
            ListNode val=new ListNode(l2.val);
            res.next=val;
            res=res.next;
            }
            l2=l2.next;
        }
        return k;
    }
}