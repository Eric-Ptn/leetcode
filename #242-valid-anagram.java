import java.util.HashMap;

class Solution {
	public boolean isAnagram(String s, String t) {
    	HashMap<Character, Integer> sHash = new HashMap<Character, Integer>();
   	 
    	for(int i = 0; i < s.length(); i++){
        	if(sHash.get(s.charAt(i)) == null){
            	sHash.put(s.charAt(i), 1);
        	} else{
            	sHash.put(s.charAt(i), sHash.get(s.charAt(i))+1);
        	}
    	}
   	 
    	for(int i = 0; i < t.length(); i++){
        	if(sHash.get(t.charAt(i)) == null || sHash.get(t.charAt(i)) < 0){
            	return false;
        	} else {
            	sHash.put(t.charAt(i), sHash.get(t.charAt(i))-1);
        	}
    	}
   	 
    	for (Integer i : sHash.values()) {
        	if(i != 0){
            	return false;
        	}
    	}    

    	return true;
	}
}