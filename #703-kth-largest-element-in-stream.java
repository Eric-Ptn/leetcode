import java.util.PriorityQueue;

class KthLargest {
    
	PriorityQueue<Integer> numHeap;
	int k;
    
	public KthLargest(int k, int[] nums) {

    	this.k = k;
    	numHeap = new PriorityQueue<Integer>();
   	 
    	for(int num : nums){
        	numHeap.add(num);
    	}
   	 
    	while(numHeap.size() > k){
        	numHeap.poll();
    	}
   	 
	}
    
	public int add(int val) {
   	 
    	numHeap.add(val);
   	 
    	if(numHeap.size() > k){
        	numHeap.poll();
    	}
   	 
    	return numHeap.peek();
   	 
	}
}