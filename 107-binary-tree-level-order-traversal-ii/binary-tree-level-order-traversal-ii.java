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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> ans = new LinkedList();
        if(root == null) return ans;
        Deque<TreeNode> q = new ArrayDeque();
        q.offer(root);

        while(!q.isEmpty()){
            List<Integer> lvlList = new LinkedList();
            for(int i= q.size() ; i > 0 ; i--){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                lvlList.add(q.poll().val);
            }
            ans.addFirst(lvlList);
        }
        return ans;
    }
}