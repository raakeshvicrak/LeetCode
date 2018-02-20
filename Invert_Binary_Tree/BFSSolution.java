/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//BFS Approach!
class Solution {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> bfsqueue = new LinkedList<TreeNode>();
        bfsqueue.add(root);
        
        while(bfsqueue.peek() != null){
            TreeNode temp = bfsqueue.poll();
            
            TreeNode templeft = temp.left;
            temp.left = temp.right;
            temp.right = templeft;
            
            if(temp.left != null){
                bfsqueue.add(temp.left);
            }
            if(temp.right != null){
                bfsqueue.add(temp.right);
            }
        }
        
        return root;
        
    }
}
