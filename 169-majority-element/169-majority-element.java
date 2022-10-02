class Solution {
    public int majorityElement(int[] arrayOfNumbers) {
        Arrays.sort(arrayOfNumbers);
        return arrayOfNumbers[arrayOfNumbers.length/2];
    }
}