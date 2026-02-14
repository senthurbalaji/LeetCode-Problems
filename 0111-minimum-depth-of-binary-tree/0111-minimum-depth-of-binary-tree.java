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
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null)
            return 1+minDepth(root.right);
        if(root.right==null)
            return 1+minDepth(root.left);
        int Right_Depth=minDepth(root.left);
        int left_Depth=minDepth(root.right);
        return 1+Math.min(left_Depth,Right_Depth);
    }
}