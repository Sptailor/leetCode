//Suhail Tailor
// Recursively computes the maximum depth of a binary tree.
// Base case: return 0 if the node is null.
// Otherwise, find the max depth of the left and right subtrees
// and return 1 + the larger of the two.

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
    public int maxDepth(TreeNode root) {

        if (root==null)return 0;
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        return 1+ Math.max(leftDepth,rightDepth);

       
    }
}