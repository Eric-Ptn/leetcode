/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
   	 
    	ListNode pointer1 = list1;
    	ListNode pointer2 = list2;
   	 
    	ListNode currentNode;
    	ListNode returnNode;
   	 
    	if(pointer1 == null && pointer2 == null){
        	return null;
    	}
   	 
    	if(pointer2 == null || (pointer1 != null && pointer1.val < pointer2.val)){
        	currentNode = pointer1;
        	pointer1 = pointer1.next;
    	} else {
        	currentNode = pointer2;
        	pointer2 = pointer2.next;
    	}
   	 
    	returnNode = currentNode;
   	 
    	while(!(pointer1 == null && pointer2 == null)){
        	if(pointer2 == null || (pointer1 != null && pointer1.val < pointer2.val)){
            	currentNode.next = pointer1;
            	pointer1 = pointer1.next;
            	currentNode = currentNode.next;
        	} else {
            	currentNode.next = pointer2;
            	pointer2 = pointer2.next;
            	currentNode = currentNode.next;
        	}
    	}
    	return returnNode;
	}
}