class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = 
            new PriorityQueue<>((p1, p2) -> (p1[0]*p1[0] + p1[1]*p1[1]) - (p2[0]*p2[0] + p2[1]*p2[1]));
        
        for(int[] point : points) {
            minHeap.add(point);
        }
        int[][] result = new int[k][2];  
        for(int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }                                                  
       return result;
    }
}