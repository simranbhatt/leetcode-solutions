class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color)
            return image;
       colorChange(image, sr, sc, image[sr][sc], color);   
        return image;
    }
    
    public void colorChange(int[][] image, int sr, int sc, int currentColor, int newColor) {
         if(sr >= image.length || sc >= image[0].length || sr < 0 || sc < 0 || 
            image[sr][sc] != currentColor)
            return;
          image[sr][sc] = newColor;
          
          colorChange(image, sr+1, sc, currentColor, newColor);
          colorChange(image, sr-1, sc, currentColor, newColor);
          colorChange(image, sr, sc+1, currentColor, newColor);
          colorChange(image, sr, sc-1, currentColor, newColor);
    }
}