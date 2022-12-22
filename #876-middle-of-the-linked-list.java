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
	public ListNode middleNode(ListNode head) {
   	 
    	ListNode hare = head, tortoise = head; //have a fast and slow pointer
   	 
    	while(hare != null && hare.next != null){ //while the hare is not pointing to null and the spot next to hare is not null
        	hare = hare.next.next; //hare jumps two nodes
        	tortoise = tortoise.next; //tortoise moves to next node
       	 
    	}
   	 
    	return tortoise; //once the condition of the while loop is not met, tortoise is at "middle" node
   	 
	}
}