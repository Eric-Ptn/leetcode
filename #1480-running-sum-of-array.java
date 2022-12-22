class Solution {
    public static int[] runningSum(int[] nums) {
        
        int[] runningSumArray = new int[nums.length];
        
        runningSumArray[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            runningSumArray[i] = runningSumArray[i-1] + nums[i];
        }
        
        return runningSumArray;
    }
}