import java.util.HashMap;

class Solution {
	public int[] twoSum(int[] nums, int target) {
   	 
    	HashMap<Integer, Integer> numsHash = new HashMap<Integer, Integer>();
   	 
    	for(int i = 0; i < nums.length; i++){    	 
        	if(numsHash.get(target - nums[i]) != null){
            	int[] answer = {numsHash.get(target - nums[i]), i};
            	return answer;
        	}else{
            	numsHash.put(nums[i], i);
        	}
    	}
   	 
    	return null;
	}
}