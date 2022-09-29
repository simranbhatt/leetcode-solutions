import java.util.HashMap;

class Solution {
    public int romanToInt(String romanNumber) {
        int integerValue = 0;
        HashMap<Character, Integer> romanNumeralDictionary = new HashMap<>();
        romanNumeralDictionary.put('I', 1);
        romanNumeralDictionary.put('V', 5);
        romanNumeralDictionary.put('X', 10);
        romanNumeralDictionary.put('L', 50);
        romanNumeralDictionary.put('C', 100);
        romanNumeralDictionary.put('D', 500);
        romanNumeralDictionary.put('M', 1000);
        
        for(int i = 0; i < romanNumber.length(); i++) {
            int currentValue = romanNumeralDictionary.get(romanNumber.charAt(i));
            if(i+1 < romanNumber.length()) {
                int nextValue = romanNumeralDictionary.get(romanNumber.charAt(i+1));
                if(currentValue < nextValue) {
                    integerValue += nextValue - currentValue;
                    i++;
                    continue;
                } 
            }
            integerValue += currentValue;
        }
        
        return integerValue;
    }
      
}