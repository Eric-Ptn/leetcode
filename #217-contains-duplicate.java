import java.util.HashSet;

class Solution {
	public boolean containsDuplicate(int[] nums) {
    	HashSet<Integer> entries = new HashSet<Integer>();
   	 
    	for(int i : nums){
        	if(entries.contains(i) == true){
            	return true;
        	}
        	entries.add(i);
    	}
   	 
    	return false;
	}
}