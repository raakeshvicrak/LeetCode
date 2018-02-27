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
    public boolean hasPathSum(TreeNode root, int sum) {
        return hasPathSumRecur(root, sum);
    }
    
    private boolean hasPathSumRecur(TreeNode node, int sum){
        if(node == null){
            return false;
        }
        
        if(node.val - sum == 0 && node.left == null && node.right == null){
            return true;
        }
        
        return hasPathSumRecur(node.left, sum - node.val) || hasPathSumRecur(node.right, sum - node.val);
    }
}
