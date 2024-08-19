/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> a = new PriorityQueue<Integer>();
        int f = 0;
        if (lists.length == 0)
            return null;
        for (ListNode temp : lists) {
            while (temp != null) {
                a.add(temp.val);
                temp = temp.next;
                f = 1;
            }
        }
        if(f==0)
        return null;
        ListNode b = new ListNode(0);
        ListNode r = new ListNode(0);
        ListNode e = b;
        ListNode c = b;
        int count = 0;
        while (!a.isEmpty()) {
            // System.out.println(i);
            if (count == 0) {
                b.val = a.poll();
            } else {
                if (count == 1) {
                    r.val = a.poll();
                    b.next = r;
                } else {
                    ListNode k = new ListNode(a.poll());
                    r.next = k;
                    r = r.next;
                }
            }
            count++;
        }

        return e;
    }
}