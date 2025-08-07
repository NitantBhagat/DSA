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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList();
        if(root == null) return ans;
        inorder(ans, root);
        return ans;
    }

    private static void inorder(List<Integer> ans, TreeNode root){
        if(root.left != null){
            inorder(ans,root.left);
        }
        ans.add(root.val);
        if(root.right != null){
            inorder(ans, root.right);
        }
    }
}