class Solution {
    public void rotate(int[][] matrix) {
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<=i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
    
            }
        }
        for(int a =0;a<matrix.length;a++){
            int s=0;
            int e =matrix.length-1;
            while(s<e){
                int temp = matrix[a][s];
                matrix[a][s]= matrix[a][e];
                matrix[a][e]=temp;
                s++;
                e--;
            }
        }
    }
    
        
}
