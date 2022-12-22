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
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
   	 
    	if(subRoot == null){
        	return true;
    	}
   	 
    	if(root == null){
        	return false;
    	}
   	 
    	if(root.val != subRoot.val){
        	if(isSubtree(root.right, subRoot)){
            	return true;
        	}
        	else if(isSubtree(root.left, subRoot)){
            	return true;
        	}
    	}
   	 
    	if(root.val == subRoot.val && isSameTree(root, subRoot)){
        	return true;
    	} else if(isSubtree(root.right, subRoot)){
        	return true;
    	} else if(isSubtree(root.left, subRoot)){
        	return true;
    	}
   	 
    	return false;
   	 
	}
    
	public boolean isSameTree(TreeNode p, TreeNode q){
   	 
    	if(p == null && q == null){
        	return true;
    	}
   	 
    	if(p == null || q == null){
        	return false;
    	}
   	 
    	if(p.val != q.val){
        	return false;
    	}
   	 
    	if(p.val == q.val && isSameTree(p.right, q.right) && isSameTree(p.left, q.left)){
        	return true;
    	}
   	 
    	return false;
	}
    
}