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
	public TreeNode invertTree(TreeNode root) {
    	if(root == null){
        	return root;
    	}
    	invertSubTree(root);
    	return root;
	}
    
	public void invertSubTree(TreeNode subroot){
    	TreeNode temp = subroot.left;
    	subroot.left = subroot.right;
    	subroot.right = temp;
   	 
    	if(subroot.right != null){
        	invertSubTree(subroot.right);
    	}
    	if(subroot.left != null){
        	invertSubTree(subroot.left);
    	}
   	 
	}
}