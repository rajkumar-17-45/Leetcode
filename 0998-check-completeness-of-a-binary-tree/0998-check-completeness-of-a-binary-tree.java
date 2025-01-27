class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        boolean f=false;
        while(!queue.isEmpty())
        {
            TreeNode tree=queue.poll();
            if(tree==null)
            {
              f=true;
            }
            else
            {
                if(f)
                return false;
                queue.add(tree.left);
                queue.add(tree.right);
            }
        }
        return true;
    }
}
