import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] match = new int[2];
        HashMap<Integer, Integer> traversedNumbers = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(traversedNumbers.containsKey(target - nums[i])) {
                match[0] = traversedNumbers.get(target - nums[i]);
                match[1] = i;
            }
            else {
                traversedNumbers.put(nums[i], i);
            }            
        }
        return match;
    }
}