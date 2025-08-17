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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans = new int[1];
        ans[0] = Integer.MIN_VALUE;

        helper(root,ans);
        
        return ans[0];
    }

    private static int helper(TreeNode root, int[] maxDia){
        if(root == null) return 0;

        int heightL = helper(root.left,maxDia);
        int heightR = helper(root.right,maxDia);
        
        if(maxDia[0] < (heightL+heightR+1)){
            maxDia[0] = heightL+heightR;
        }

        return 1 + Math.max(heightL , heightR);
    }
}