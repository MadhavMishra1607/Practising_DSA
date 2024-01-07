class Solution {
    public boolean isPerfectSquare(int num) {
        if(num ==1){
            return true;
        }
        int low =0;
        int high= num;
        while(low<high){
            int mid= low+(high-low)/2;
            if(num%mid==0 && mid == num/mid){
                return true;
            }
            else if(mid<=num/mid){
                low = mid+1;
            }
            else{
                high = mid;

            }

        }return false;
    }
}
