import java.time.temporal.ValueRange;

class Solution {
    public boolean isPalindrome(String sentence) {
        
        sentence = sentence.toLowerCase();
        ValueRange numberRange = ValueRange.of(48, 57);
        ValueRange letterRange = ValueRange.of(97, 122);
        
        //pointers at both ends of the string
        int startPointer = 0;
        int endPointer = sentence.length() - 1;
        
        while(startPointer < endPointer) {
            
          //moving the start pointer forward if the value is not a lowercase alphabet         
          while(startPointer < sentence.length()
                && !numberRange.isValidIntValue(sentence.charAt(startPointer))
                && !letterRange.isValidIntValue(sentence.charAt(startPointer))) {
                   startPointer++;
            }
            
          //moving the end pointer backward if the value is not a lowercase alphabet
          while(endPointer >= 0 && !numberRange.isValidIntValue(sentence.charAt(endPointer)) 
                && !letterRange.isValidIntValue(sentence.charAt(endPointer))) {
                   endPointer--;
            }
           //comparing the valid alphanumeric values at either end of the string
           if(startPointer < endPointer && 
           sentence.charAt(startPointer++) != sentence.charAt(endPointer--))
             return false;
        }
        return true;
    }
}