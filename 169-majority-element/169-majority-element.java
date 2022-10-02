class Solution {
    public int majorityElement(int[] arrayOfNumbers) {
        Arrays.sort(arrayOfNumbers);
        //any value that takes up more than half the array will be at the n/2 position when sorted
        return arrayOfNumbers[arrayOfNumbers.length/2];
    }
}