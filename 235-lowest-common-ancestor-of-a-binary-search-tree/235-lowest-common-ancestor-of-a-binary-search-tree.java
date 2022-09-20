/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //if p and q are on the same side below the current root, the current root is not their common       ancestor
        if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
         
        if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);
        //if they are on opposite sides, or one/both of them is equal to the root itself, the root          satisfies the conditions for being the lowest common ancestor
        return root;
    }
}