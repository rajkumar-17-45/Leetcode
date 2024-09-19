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
     TreeNode root;
     int i=0;
     List<Integer> a=new ArrayList<Integer>();
    public BSTIterator(TreeNode root) {
        this.root=root;
        inorder(root);
    }
    
    void inorder(TreeNode root)
    {
        if(root==null)
        return ;
        inorder(root.left);
        a.add(root.val);
        inorder(root.right);
    }
    public int next() {
    return a.get(i++);
    }
    
    public boolean hasNext() {
        if(i>=a.size())
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