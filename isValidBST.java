//By Suhail Tailor
 /**
     * Checks if a binary tree is a valid BST using inorder traversal.
     * Inorder traversal of a BST should produce a strictly increasing sequence.
     * We keep track of the previous node visited ("prev") and ensure
     * that each current node's value is greater than the previous one.
     */

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
    private TreeNode prev=null;
    public boolean isValidBST(TreeNode root) {

        if(root==null)return true;// An empty tree is a valid BST

        if(!isValidBST(root.left)) return false;        // Recursively check the left subtree

         // Check current node value with the previous node value

        if(prev!=null &&root.val<=prev.val)return false;// Current node must be greater than previous node

        prev=root;

        return isValidBST(root.right);
    
    }
}