class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> duplicates = new HashSet<>();
        for(int i : nums) {
            if(!duplicates.contains(i)) {
                duplicates.add(i);
            } else {
                return true;
            }
        }
        return false;
    }
}