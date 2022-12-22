class Solution {
	public int findNumbers(int[] nums) {
   	 
    	int evenCount = 0;
   	 
    	for(int i = 0; i < nums.length; i++){
       	 
        	int currentNum = nums[i];
       	 
        	int numDigits = 0;
       	 
        	while(currentNum >= 1){
           	 
            	currentNum /= 10;
            	numDigits++;
           	 
        	}
       	 
        	if(numDigits % 2 == 0){
            	evenCount++;
        	}
       	 
    	}
   	 
    	return evenCount;
   	 
   	 
	}
}