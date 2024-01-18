class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row= mat.length;
        int col= mat[0].length; 
        int []arr =new int[row*col];
        int index=0;
        int i=0;
        int j=0;
        while(index<arr.length){
            arr[index] = mat[i][j];
            if((i+j)%2==0){
                if(j<col-1 && i>0){
                    i--;
                    j++;
                }
                else if(j<col-1){
                   j++;
                }
                else{
                    i++;
                }
            }
            else{
                if(i<row-1 && j>0){
                    i++;
                    j--;
                }
                else if(i<row-1){
                    i++;
                }    
                else {
                    j++;
                }

            }
            index++;
        }
        return arr;
    }
}
