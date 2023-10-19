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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode dummy = new TreeNode(0, null, null);
        TreeNode n = dummy;
        newTree(root, list);
        for (int num : list) {
            dummy.right = new TreeNode(num, null, null);
            dummy = dummy.right;
        }
        return n.right;
    }
    public void newTree(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        newTree(root.left, list);
        list.add(root.val);
        newTree(root.right, list);
    }
}