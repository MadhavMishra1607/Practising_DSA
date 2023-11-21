class Solution {
    public void row_zero(int [][]matrix,int row){
        for(int i =0 ;i<matrix[0].length;i++){
            matrix[row][i]=0;
        }
    }
    public void col_zero(int [][]matrix,int col){
        for(int i =0 ;i<matrix.length;i++){
            matrix[i][col]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        boolean[][]zero  = new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    zero[i][j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(zero[i][j]){
                    row_zero(matrix,i);
                    col_zero(matrix,j);
                }
            }
        }

    }
}
