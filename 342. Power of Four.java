class Solution {
    public boolean isPowerOfFour(int n) {
        
        
        if(n==1){
            return true;
        }
        else if(n==0 || n==2 ||n==3){
            return false;
        }
        else if(n%4==0){
            return isPowerOfFour(n/4);
        }
        else{
            return false;
        }
        
    }
}
