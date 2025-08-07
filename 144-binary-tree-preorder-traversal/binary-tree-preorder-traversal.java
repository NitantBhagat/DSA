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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList();
        preorder(ans, root);
        return ans;
    }

    private static void preorder(List<Integer> ans, TreeNode node){
        if(node!=null){
            ans.add(node.val);
            if(node.left!=null){
                preorder(ans, node.left);
            }
            if(node.right != null){
                preorder(ans, node.right);
            }
        }
    }
}