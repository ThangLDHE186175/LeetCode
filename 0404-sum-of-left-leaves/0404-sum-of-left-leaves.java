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
    public int sumOfLeftLeaves(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        sum(root, list);
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
    public void sum(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(0);
        }
        if (root.left != null && root.left.left == null && root.left.right == null)  {
            list.add(root.left.val);
            System.out.println(root.left.val);
        }
        if (root.left != null) sum(root.left, list);
        if (root.right != null) sum(root.right, list);
        
    }
}