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
        int check = height(root);
        return check == -1 ? false :true;
    }

    private static int height(TreeNode Node){
        if(Node == null){
            return 0;
        }
        
        int leftH = height(Node.left);
        int rightH = height(Node.right);

        if(leftH == -1 || rightH == -1) return -1;
        if(Math.abs(leftH-rightH) >  1) return -1;

        return Math.max(leftH,rightH) + 1;
    }
}