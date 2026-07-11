class Day38 {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int count = 1;

        while (count <= n * n) {

           
            for (int i = left; i <= right; i++) {
                matrix[top][i] = count++;
            }
            top++;

          
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count++;
            }
            right--;

           
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = count++;
                }
                bottom--;
            }

          
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = count++;
                }
                left++;
            }
        }

        return matrix;
    }
}