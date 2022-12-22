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
	public boolean hasCycle(ListNode head) {
   	 
    	ListNode hare = head;
    	ListNode tortoise = head;
   	 
    	while(hare != null && hare.next != null){
       	 
        	hare = hare.next.next;
        	tortoise = tortoise.next;
       	 
        	if(hare == tortoise){
            	return true;
        	}
    	}
   	 
    	return false;
	}
}