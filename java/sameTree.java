//Suhail Tailor
// Recursively checks if two binary trees are the same by comparing node values 
// and ensuring both left and right subtrees are identical in structure and content.
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
      
       if(p==null && q==null)return true;

       if(p==null || q==null)return false;

       if(p.val!=q.val)return false;

        return isSameTree(p.right,q.right) &&isSameTree(p.left,q.left);

        
    }
}