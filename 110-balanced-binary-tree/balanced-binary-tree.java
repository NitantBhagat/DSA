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
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode root){
        
        if(root == null ) return 0;

        int LeftHeight = height(root.left);

        if(LeftHeight == -1) return -1;

        int RightHeight = height(root.right);

        if(RightHeight == -1) return -1;

        if(Math.abs(LeftHeight-RightHeight) > 1) return -1;

        return Math.max(LeftHeight,RightHeight)+1;
    }
}