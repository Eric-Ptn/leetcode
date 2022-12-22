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
    
	int diameter = 0;
    
	public int diameterOfBinaryTree(TreeNode root) {
    	height(root);
    	return diameter;
	}
    
	private int height(TreeNode root){
       	 
        	if(root == null){
            	return -1;
        	}
       	 
        	int left = height(root.left);
        	int right = height(root.right);
   	 
        	int thisHeight = 1 + Math.max(left, right);       	 
        	int thisDiameter = 2 + left + right;
       	 
        	diameter = Math.max(diameter, thisDiameter);
       	 
        	return thisHeight;
       	 
	}
}