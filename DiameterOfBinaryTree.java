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
    public int diameter=0;
    public int max_diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter=1;
        traverse(root);
        return diameter-1;
    }
    public int traverse(TreeNode node){
        if(node == null){
            return 0;
        }
        int left=traverse(node.left);
        int right=traverse(node.right);
        diameter=Math.max(diameter, left+right+1);
        return Math.max(left, right)+1;
    }
}
