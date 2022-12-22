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
	public ListNode reverseList(ListNode head) {

    	ListNode currentNode = head;
    	ListNode prev = null;
   	 
    	while(currentNode != null){
        	ListNode nxt = currentNode.next;
        	currentNode.next = prev;
        	prev = currentNode;
        	currentNode = nxt;
    	}
   	 
    	return prev; //when the currentNode becomes null, prev will be on head of reversed list
	}
}