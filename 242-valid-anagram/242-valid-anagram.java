class Solution {
    public boolean isAnagram(String firstWord, String secondWord) {
        HashMap<Character, Integer> firstMap = new HashMap<>();
        HashMap<Character, Integer> secondMap = new HashMap<>();
        for(char letter : firstWord.toCharArray()) {
            firstMap.merge(letter, 1, Integer::sum);
        }
        for(char letter : secondWord.toCharArray()) {
            secondMap.merge(letter, 1, Integer::sum);
        }
        
        if(firstMap.equals(secondMap))
            return true;
        
        return false;
    }
}