class Solution {
    public boolean isPowerOfTwo(int n) {
        int half = n/2;
        if(n==1){
            return true;
        }
        else if(n==0){
            return false;
        }
        else if(n%2==0){
            return isPowerOfTwo(half);
        }
        else{
            return false;
        }
    }
}
