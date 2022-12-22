class Solution {
	public boolean isPalindrome(String s) {
    	s = s.toLowerCase();

    	int startPointer = 0;
    	int endPointer = s.length() - 1;

    	while(startPointer < endPointer){
        	if(isAlphanumeric(s, startPointer) && isAlphanumeric(s, endPointer)){
            	if(s.charAt(startPointer) != s.charAt(endPointer)){
                	return false;
            	}
            	if(s.charAt(startPointer) == s.charAt(endPointer)){
                	startPointer++;
                	endPointer--;
            	}
        	}
        	if(!(isAlphanumeric(s, startPointer))){
            	startPointer++;
        	}
        	if(!(isAlphanumeric(s, endPointer))){
            	endPointer--;
        	}
    	}

    	return true;
	}

	public boolean isAlphanumeric(String s, int pointer){
    	boolean isAlphanumeric = (s.charAt(pointer) >= 97 && s.charAt(pointer) <= 122) || (s.charAt(pointer) >= 48 && s.charAt(pointer) <= 57);

    	return isAlphanumeric;
	}
}