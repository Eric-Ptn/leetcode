class Solution {

    public int climbStairs(int n) {
        int twoStep = 1;
        int oneStep = 1;
        int temp;
        
        for(int i = 0; i < n-1; i++){
            
            temp = oneStep + twoStep;
            twoStep = oneStep;
            oneStep = temp;
            
        }
        
        return oneStep;
        
    }

}