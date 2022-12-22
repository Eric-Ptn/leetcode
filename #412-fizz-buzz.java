import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
	public List<String> fizzBuzz(int n) {
   	 
    	List<String> answer = new ArrayList<String>();

    	HashMap<Integer, String> fizzBuzzHash = new HashMap<Integer, String>(){
        	{
            	put(3, "Fizz");
            	put(5, "Buzz");
        	}   	 
    	};
   	 
    	int[] divisorArray = {3,5};
   	 
   	 
    	for(int i = 1; i <= n; i++){
        	String ans = "";
        	for(int divisor : divisorArray){
            	if(i % divisor == 0){
                	ans += fizzBuzzHash.get(divisor);
            	}
        	}
        	if(ans.equals("")){
            	ans = Integer.toString(i);
        	}
       	 
        	answer.add(ans);
       	 
    	}
   	 
    	return answer;
	}
}