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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        if(root == null) return ans;
        Deque<TreeNode> q = new ArrayDeque();
        q.offer(root);
        int flag = 1;
        while(!q.isEmpty()){
            LinkedList<Integer> level = new LinkedList();

            for(int i= q.size() ; i >  0 ; i--){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                if(flag%2 == 1){
                    level.add(q.poll().val);
                }else{
                    level.addFirst(q.poll().val);
                }
            }
            ans.add(level);
            flag++;
        }
        return ans;
    }
}