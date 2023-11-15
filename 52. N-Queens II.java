class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        int ans = queens(board,0);
        return ans;
        
    }
    static int queens(boolean[][] matrix, int row){
        if(row == matrix.length){
            display(matrix);
            System.out.println();
            return 1;
        }
        int count =0;
        for(int col=0; col< matrix[0].length;col++){
            if(is_safe(matrix,row,col)){
                matrix[row][col] =true;
                count+= queens(matrix,row+1);
                matrix[row][col] =false;
            }
        }return count;
    }
    static boolean is_safe(boolean [][] matrix ,int row, int col){
        //vertical row
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[i][col]){
                return false;
            }
        }
        //left diagonal
        int maxleft = Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(matrix[row-i][col-i]){
                return false;
            }
        }
        //right diagonal
        int maxright = Math.min(row,matrix[0].length-col-1);
        for(int i=1;i<= maxright; i++){
            if(matrix[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    static void display(boolean [][]matrix){
        for(boolean[] arr: matrix){
            for(boolean element:arr){
                if(element == true){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
