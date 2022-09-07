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
            //adding the last node in a path without an arrow
            path = path + node.val;
            //adding a completed path to the list
            paths.add(path);
            //clearing path variable once a path is completed
            path = "";
        } else {
            //we haven't yet reached the end of a path. add the value and arrow
            path = path + node.val + "->";
        }
        createPathString(node.left, paths, path);
        createPathString(node.right, paths, path);
       } 
       return paths; 
    }
}