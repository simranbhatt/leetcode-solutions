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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        return createPathString(root, paths, "");
     
    }
    
    List<String> createPathString(TreeNode node, List<String> paths, String path)  { 
        if(node != null) {
         
        if(node.left == null && node.right == null) {
            path = path + node.val;
            paths.add(path);
            path = "";
        } else {
            path = path + node.val + "->";
        }
        createPathString(node.left, paths, path);
        createPathString(node.right, paths, path);
       } 
       return paths; 
    }
}