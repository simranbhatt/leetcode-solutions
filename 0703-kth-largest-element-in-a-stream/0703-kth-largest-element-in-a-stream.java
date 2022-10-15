class KthLargest {
    
  private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
  private int[] nums;
  private int k;
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        for(int num : nums) {
            minHeap.add(num);
        }
        while(minHeap.size() > k) {
            minHeap.remove();
        }
    }
    
    public int add(int val) {
            minHeap.add(val);
        if(minHeap.size() > k)
            minHeap.remove();
        
        return minHeap.peek();
    }
}
    
    

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */