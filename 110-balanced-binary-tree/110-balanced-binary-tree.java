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
      if(root == null)
          return true;
      if(Math.abs(calculateHeight(root.left, 0) - calculateHeight(root.right, 0)) > 1) 
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int calculateHeight(TreeNode node, int height) {
        if(node == null) 
            return 0;
        
     return Math.max(calculateHeight(node.left, height), calculateHeight(node.right, height)) + 1;
    }
}