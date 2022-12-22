class Solution {
	public int[] sortedSquares(int[] nums) {
   	 
    	int[] sortedSquares = new int[nums.length];
   	 
    	int pointerRight = nums.length - 1;
    	int pointerLeft = 0;
   	 
    	for(int i = nums.length - 1; i >= 0; i--){
        	if(Math.abs(nums[pointerRight]) > Math.abs(nums[pointerLeft])){
            	sortedSquares[i] = (int) Math.pow(nums[pointerRight],2);
            	pointerRight--;
        	} else {
            	sortedSquares[i] = (int) Math.pow(nums[pointerLeft],2);
            	pointerLeft++;
        	}
    	}
   	 
    	return sortedSquares;
   	 
	}
}