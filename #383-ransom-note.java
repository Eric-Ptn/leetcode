import java.util.HashMap;

class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
   	 
    	HashMap<Character, Integer> magHash = new HashMap<Character, Integer>();
   	 
    	for(int i = 0; i < magazine.length(); i++){
        	if(magHash.get(magazine.charAt(i)) == null){
            	magHash.put(magazine.charAt(i), 1);
        	} else {
            	magHash.put(magazine.charAt(i), magHash.get(magazine.charAt(i)) + 1);
        	}
    	}
   	 
    	for(int i = 0; i < ransomNote.length(); i++){
       	 
        	if(magHash.get(ransomNote.charAt(i)) == null){
            	return false;
        	}
       	 
        	magHash.put(ransomNote.charAt(i), magHash.get(ransomNote.charAt(i)) - 1);
       	 
        	if(magHash.get(ransomNote.charAt(i)) < 0){
            	return false;
        	}
    	}

    	return true;
   	 
	}
}