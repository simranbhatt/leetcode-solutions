class Solution {
    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        while(min <= max) {    
            int mid = min + (max-min)/2;
            System.out.println(mid);
            if(target == nums[mid]) {
                return mid;
            } 
            else if(target < nums[mid]) {
                max = mid-1;
            }
            else if(target > nums[mid]) {
                min = mid+1;
            }
        }
        
        return -1;
    }
}