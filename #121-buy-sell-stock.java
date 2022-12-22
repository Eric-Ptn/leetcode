class Solution {
	public int maxProfit(int[] prices) {
   	 
    	int currentMin = prices[0];
    	int maxProfit = 0;
   	 
    	for(int price : prices){
        	if(price - currentMin > maxProfit){
            	maxProfit = price - currentMin;
        	}
        	if(price < currentMin){
            	currentMin = price;
        	}
    	}
   	 
    	return maxProfit;
   	 
	}
}