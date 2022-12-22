class Solution {
	public int findMaxConsecutiveOnes(int[] nums) {
   	 
    	int maxConsecutiveOnes = 0;
    	int currentConsecutiveOnes = 0;
   	 
    	for(int i = 0; i < nums.length; i++){
        	if(nums[i] == 1){
            	currentConsecutiveOnes++;
            	if(currentConsecutiveOnes > maxConsecutiveOnes){
                	maxConsecutiveOnes = currentConsecutiveOnes;
            	}
        	}else{
            	currentConsecutiveOnes = 0;
        	}
       	 
    	}
   	 
    	return maxConsecutiveOnes;
   	 
   	 
	}
}