class Day44 {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
                if(i+j==n-1){
                    if(i!=j){
                        sum+=mat[i][j];
                    }
                }
            }
          
        }
          return sum;
    }
}