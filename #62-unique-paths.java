class Solution {
	public int uniquePaths(int m, int n) {
   	 
    	int[][] grid = new int[m][n];
   	 
   	 
    	//fill in last row with 1s
    	for(int i = 0; i < n; i++){
        	grid[m-1][i] = 1;
    	}
   	 
    	//fill in last column with 1s
    	for(int i = 0; i < m; i++){
        	grid[i][n-1] = 1;
    	}
   	 
    	//fill in rest
    	for(int i = m-2; i >= 0; i--){
        	for(int j = n-2; j >= 0; j--){
            	grid[i][j] = grid[i + 1][j] + grid[i][j+1];
        	}
    	}
   	 
    	return grid[0][0];
	}
}