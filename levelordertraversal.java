class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q =new LinkedList<TreeNode>();//For temporarily soring the elements
        List<List<Integer>> finallist = new LinkedList<List<Integer>>();//returning the level order traversal
        if(root == null)
            return finallist;//No levelwise traversal possible for this
        q.offer(root);//Putting root into the queue
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> sublist=new LinkedList<Integer>();//For storing elements level wise
            for(int i=0;i<n;i++)
            {
                if(q.peek().left!=null)
                    q.offer(q.peek().left);//Pushed to queue if left child existed
                if(q.peek().right!=null)
                    q.offer(q.peek().right);//Pushed to queue if right child existed
                    sublist.add(q.poll().val);//list for storing elements levelwise
            }
            finallist.add(sublist);
        }
        return finallist;//list for level order traversal of the tree
    }
}