/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//DFS Approach!
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        
        Stack<TreeNode> dfsstack = new Stack<TreeNode>();
        dfsstack.push(root);
        
        while(!dfsstack.empty()){
            TreeNode temp = dfsstack.pop();
            TreeNode templeft = temp.left;
            temp.left = temp.right;
            temp.right = templeft;
            
            if(temp.right != null){
                dfsstack.push(temp.right);
            }
            
            if(temp.left != null){
                dfsstack.push(temp.left);
            }
        }
        
        return root;
    }
}
