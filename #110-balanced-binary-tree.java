/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
	public boolean isBalanced(TreeNode root) {
   	 
    	if(root == null){
        	return true;
    	}
   	 
    	if(Math.abs(height(root.left)-height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right)){
        	return true;
    	}
   	 
    	return false;
	}
    
	public int height(TreeNode root){
   	 
    	if(root == null){
        	return -1;
    	}
   	 
    	int height = 1 + Math.max(height(root.left),height(root.right));
   	 
    	return height;
	}
    
}