class Solution {
    public boolean judgeSquareSum(int n) {
        long i=0;
        long j = (long)(Math.sqrt(n));
        
        while(i<=j){
            
            if(i*i + j*j > n){
                j--;
            }
            else if(i*i + j*j < n){
                i++;
            }
            else{
                return true;
            }
            
        }return false;
    }
}
