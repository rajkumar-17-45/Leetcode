/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
         if(root==null)
         return root;
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        // Node s=new Node();
        while(!queue.isEmpty())
        {
           int s=queue.size();
           for(int i=0;i<s;i++)
           {
            Node p=queue.poll();
            // if(!queue.isEmpty())
            if(i<s-1)
            p.next=queue.peek();
            else
            p.next=null;
            if(p.left!=null)
            {
             queue.add(p.left);
            }
            if(p.right!=null)
            {
              queue.add(p.right);
            }
            // if()
           }
        }
        return root;
    }
}