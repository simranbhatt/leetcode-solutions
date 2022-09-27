class Solution {
    public int climbStairs(int top) {
      int[] steps = new int[top+1];
      //base case - how many ways can we climb 0 steps?
      steps[0] = 1;
      //how many ways can we climb 1 step?
      steps[1] = 1;
      for(int i = 2; i <= top; i++) {
          steps[i] = steps[i-1] + steps[i-2];
      }
       return steps[top];
    }
}