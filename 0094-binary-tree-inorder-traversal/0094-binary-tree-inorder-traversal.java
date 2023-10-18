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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        treeNodeVal(root, list);
        return list;
    }
    public void treeNodeVal(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        treeNodeVal(root.left, result);
        result.add(root.val);
        treeNodeVal(root.right, result);
        
    }
 }