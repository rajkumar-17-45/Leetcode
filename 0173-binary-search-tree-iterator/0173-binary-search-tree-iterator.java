/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    List<Integer> list=new ArrayList<Integer>();
    int i=0;
    public BSTIterator(TreeNode root) {
        inorder(root);
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
        return ;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public int next() { 
        return list.get(i++);

    }
    
    public boolean hasNext() {
        if(i>=list.size())
        return false;
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */