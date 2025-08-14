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
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque();
        List<List<Integer>> ansList = new ArrayList();

        if(root==null) return ansList;
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelNumber = queue.size();
            List<Integer> level= new ArrayList();
            for(int i =0 ; i < levelNumber ; i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                level.add(queue.poll().val);
            }
            ansList.add(level);
        }
        return ansList;
    }
}