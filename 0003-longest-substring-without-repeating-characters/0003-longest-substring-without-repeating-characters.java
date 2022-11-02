class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> currentSubstring = new HashSet<>();
        int lengthOfLongestSubstring = 0;
        int start = 0;
        int end = 0;
        while(end < s.length()) {
            if(!currentSubstring.contains(s.charAt(end))) {
                currentSubstring.add(s.charAt(end));
                lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, currentSubstring.size());
                end++;
            } else {
                currentSubstring.remove(s.charAt(start));
                start++;
            }
        }
        return lengthOfLongestSubstring;
    }
}