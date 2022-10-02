class Solution {
    public int majorityElement(int[] arrayOfNumbers) {
        HashMap<Integer, Integer> occurrenceMap = new HashMap<>();
        
        for(int number : arrayOfNumbers) {
            occurrenceMap.merge(number, 1, Integer::sum);
        }
        
        for(var number : occurrenceMap.entrySet()) {
            if(number.getValue() > arrayOfNumbers.length/2)
                return number.getKey();
        }
        
        return 0;
    }
}