class Day50 {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean found=false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    found=true;
                    return true;
                }
            }
        }
        return false;
    }
}