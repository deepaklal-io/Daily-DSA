class Day35 {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        
    
        for(int i=0;i<indices.length;i++){
         int row=indices[i][0];
         int col = indices[i][1];
         for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }

            for (int j = 0; j < m; j++) {
                matrix[j][col]++;
            }

          
        }
         
        int count=0;
         for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j]%2!=0){
                count++;
            }
           }
          
        }
        return count;
        
    }
}