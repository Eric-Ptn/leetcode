import java.util.HashMap;
import java.util.Stack;

class Solution {
	public boolean isValid(String s) {

    	Stack<Character> stringStack = new Stack<>();

    	HashMap<Character, Character> bracketHash = new HashMap<Character, Character>();

    	bracketHash.put('}','{');
    	bracketHash.put(')','(');
    	bracketHash.put(']','[');

    	for(int i = 0; i < s.length(); i++){
        	if(bracketHash.get(s.charAt(i)) != null){
            	if(stringStack.isEmpty() == false && stringStack.peek() == bracketHash.get(s.charAt(i))){
                	stringStack.pop();
            	}else{
                	return false;
            	}
        	}
        	else{
            	stringStack.add(s.charAt(i));
        	}
    	}

    	if(stringStack.isEmpty()){
        	return true;
    	}

    	return false;
	}
}