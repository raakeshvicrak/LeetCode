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
    private int maxsofar;
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        maxsofar = Integer.MIN_VALUE;
        maxPathSumRecur(root);
        return maxsofar;
    }
    
    
    private int maxPathSumRecur(TreeNode node){
        if(node == null){
            return 0;
        }
        
        int leftSum = maxPathSumRecur(node.left);
        int rightSum = maxPathSumRecur(node.right);
        
        //System.out.println(leftSum+" "+rightSum);
        int maxchildren = Math.max(leftSum, rightSum);
        
        int maxedge = Math.max(maxchildren + node.val , node.val);
        
        int maxAll = Math.max(maxedge, node.val + leftSum + rightSum);
        
        maxsofar = Math.max(maxsofar, maxAll);
        
        return maxedge;
    }
}
