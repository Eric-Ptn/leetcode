import java.util.Arrays;

class Solution {
	public int kthSmallest(int[][] matrix, int k) {
    	int[] values = new int[matrix.length*matrix.length];
   	 
    	int index = 0;
   	 
    	for(int i = 0; i < matrix.length; i++){
        	for(int j = 0; j < matrix.length; j++){
            	values[index] = matrix[i][j];
            	index++;
        	}
    	}
   	 
    	Arrays.sort(values);
   	 
    	return values[k-1];
   	 
	}
}