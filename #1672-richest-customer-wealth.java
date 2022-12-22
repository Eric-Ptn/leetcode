class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int greatestWealth = 0;
        int currentSum = 0;
        
        for(int j = 0; j < accounts[0].length; j++){
            greatestWealth += accounts[0][j];
        }
        
        for(int i = 1; i < accounts.length; i++){
            
            for(int j = 0; j < accounts[i].length; j++){
                currentSum += accounts[i][j];
            }
            
            if(currentSum > greatestWealth){
                greatestWealth = currentSum;
            }
            
            currentSum = 0;     
        }
        
        return greatestWealth;
    }
}