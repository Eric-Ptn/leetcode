class Solution {
	public int minCostClimbingStairs(int[] cost) {
    	int twoStep = cost.length - 1;
    	int oneStep = cost.length - 2;
   	 
    	int totalCost = 0;
    	int twoStepCost = cost[twoStep];
    	int oneStepCost = cost[oneStep];
   	 
    	if(cost.length == 1){
        	return cost[0];
    	}
   	 
    	while(twoStep >= 1){
        	totalCost = Math.min(oneStepCost, twoStepCost);
        	int oldTwoStepCost = twoStepCost;
        	oneStep--;
        	twoStep--;
        	twoStepCost = oneStepCost;
        	if(oneStep >= 0)
            	oneStepCost = cost[oneStep] + Math.min(twoStepCost, oldTwoStepCost);
    	}
   	 
    	return totalCost;
   	 
	}
}