class Solution {
    public int[][] updateMatrix(int[][] mat) {
        for(int m = 0; m < mat.length; m++) {
            for(int n = 0; n < mat[m].length; n++) {
                if(mat[m][n] != 0) {
                    mat[m][n] = 1 + minimumTopOrLeftValue(mat, m, n);
                }
            }
        }
        
        for(int m = mat.length - 1; m >= 0; m--) {
            for(int n = mat[m].length - 1; n >= 0; n--) {
                if(mat[m][n] != 0) {
                    mat[m][n] = Math.min(mat[m][n], 1 + minimumBottomOrRightValue(mat, m, n));
                }
            }
        }

        return mat;
    }
    
    public int minimumTopOrLeftValue(int[][] matrix, int m, int n) {
        int left = n > 0 ? matrix[m][n-1] : 100000; //if the value doesn't exist, set an unreachably high value
        int top = m > 0 ? matrix[m-1][n] : 100000;
        return Math.min(left, top);
                        
    }
    
    public int minimumBottomOrRightValue(int[][] matrix, int m, int n) {
        int right = n < matrix[m].length - 1 ? matrix[m][n+1] : 100000;
        int bottom = m < matrix.length - 1 ? matrix[m+1][n] : 100000;
        return Math.min(right, bottom);
    }
    
    
}