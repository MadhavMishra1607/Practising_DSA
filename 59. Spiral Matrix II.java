class Solution {
    public int[][] generateMatrix(int n) {
        int[] arr =new int[n*n]; 
        for(int a =0;a<arr.length;a++){
            arr[a] = a+1;
        }
        int [][] matrix = new int [n][n];
        int fcol = 0;
        int lcol = n-1;
        int frow = 0;
        int lrow = n-1;
        int index = 0;
        while(index<arr.length && frow<=lrow && fcol<= lcol){
            for(int j=fcol;j<=lcol ;j++){
                matrix[frow][j]= arr[index];
                index++;
                
            }
            frow++;
            for(int i=frow;i<=lrow;i++){
                matrix[i][lcol]= arr[index];
                index++;
                
            }
            lcol--;
            if(frow<=lrow){
                for(int j=lcol;j>=fcol;j--){
                    matrix[lrow][j]= arr[index];
                    index++;
                    
                }lrow--;
            }
            if(fcol<=lcol){
                for(int i=lrow;i>=frow;i--){
                    matrix[i][fcol]= arr[index];
                    index++;
                    
                }
                fcol++;
            }
        }return matrix;
    
    }
}
