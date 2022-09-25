class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        //adding all magazine letters to a hashmap
        for(char letter : magazine.toCharArray())
            magazineMap.merge(letter, 1, Integer::sum);
        
        //checking if all ransomNote letters are present in the magazine hashmap
        for(char letter : ransomNote.toCharArray()) {
            if(magazineMap.containsKey(letter) && magazineMap.get(letter) > 0)
                magazineMap.merge(letter, -1, Integer::sum);
            else
                return false; 
        }
        return true;
    }
}