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
        List<List<Integer>> ans = new LinkedList();
        Deque<TreeNode> queue = new ArrayDeque<>();

        if(root == null) return ans;
        queue.offer(root);

        while(!queue.isEmpty()){
            int lvlSize = queue.size();
            List<Integer> lvlList= new LinkedList();
            for(int i= 0 ; i < lvlSize; i++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                lvlList.add(queue.poll().val);
            }
            ans.add(lvlList);
        }
        return ans;
    }
}