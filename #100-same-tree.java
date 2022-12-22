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
	public boolean isSameTree(TreeNode p, TreeNode q) {
   	 
    	if(p == null && q == null){
        	return true;
    	}
   	 
    	if(p == null && q != null){
        	return false;
    	}
   	 
    	if(p != null && q == null){
        	return false;
    	}
    
    	if(p.val == q.val && isSameTree(p.right, q.right) && isSameTree(p.left, q.left)){
        	return true;
    	}
   	 
    	return false;
	}
}