//Suhail Tailor
// Recursively inverts a binary tree by swapping the left and right children
// of each node. For each node, swap its children, then recursively invert
// the left and right subtrees. Returns the root of the inverted tree.
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
    public TreeNode invertTree(TreeNode root) {

        if(root == null)return root;// Base case: if the node is null, return null


        TreeNode temp=root.left;//swap left and right children
        root.left=root.right;//swap right subtree to left
        root.right=temp;//swap left subtree to right

        invertTree(root.left);//swap left subtrees recursively
        invertTree(root.right);//swap right subtrees recursively
        
        return root;
        
    }
}