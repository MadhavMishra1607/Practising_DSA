class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>list = new ArrayList<>();
        int frow =0;
        int lrow = matrix.length-1;
        int fcol = 0;
        int lcol = matrix[frow].length-1;
        while(frow <= lrow && fcol <= lcol){
            for(int i =fcol; i<=lcol;i++){
                list.add(matrix[frow][i]);
            }
            frow++;
            for(int i =frow; i<= lrow;i++){
                list.add(matrix[i][lcol]);
            }
            lcol--;
            if(frow<=lrow){
                for(int i = lcol; i>=fcol;i--){
                    list.add(matrix[lrow][i]);
                }lrow--;
            }
            if (fcol<=lcol){
                for(int i = lrow;i>= frow; i--){
                    list.add(matrix[i][fcol]);
                }fcol++;
            }
        }return list;
    }
}
