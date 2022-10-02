class Solution {
    public int longestPalindrome(String allLetters) {
        
        HashMap<Character, Integer> characterOccurrences = new HashMap<>();
        int lengthOfLongestPalindrome = allLetters.length();
        int oddOccurrences = 0;       
        
        for(char letter : allLetters.toCharArray()) {
            characterOccurrences.merge(letter, 1, Integer::sum);
        }
    
        for(var letter : characterOccurrences.entrySet()) {
           int occurrence = letter.getValue();
        
            if(occurrence % 2 != 0) {
                oddOccurrences++;
            }                  
        } 
        
        //one letter with odd/single occurrence(s) can exist in a palindrome
        if(oddOccurrences >= 1)
            oddOccurrences--;
        
        //any more than one letter with odd/single occurrence(s) have to be made even 
        return lengthOfLongestPalindrome - oddOccurrences;
    }
}