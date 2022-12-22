import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
	public int lastStoneWeight(int[] stones) {
    	PriorityQueue<Integer> stoneHeap = new PriorityQueue<Integer>(stones.length, Collections.reverseOrder());
   	 
    	int bigStone, littleStone;
   	 
    	for(int stone : stones){
        	stoneHeap.add(stone);
    	}
   	 
    	while(stoneHeap.size() > 1){
        	bigStone = stoneHeap.poll();
        	littleStone = stoneHeap.poll();
       	 
        	if(bigStone > littleStone){
            	stoneHeap.add(bigStone - littleStone);
        	}
    	}
   	 
    	if(stoneHeap.size() == 1){
        	return stoneHeap.peek();
    	} else{
        	return 0;
    	}
   	 
	}
}