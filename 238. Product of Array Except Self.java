class Solution {
   
    public int[] productExceptSelf(int[] nums){
        int[]left = new int[nums.length];
        int []right = new int[nums.length];
        // left side product
        int prod=1;
        left[0]=1;
        for(int i = 1;i<left.length;i++){
            left[i] = nums[i-1]*prod;
            prod*=nums[i-1];
        }
        //right side product
        int mul = 1;
        int n = right.length-1;
        right[n]=  1;
        for(int j=n-1;j>=0;j--){
            right[j] = nums[j+1]*mul;
            mul*=nums[j+1];
        }
        //MULTIPLY BOTH ARRAYS
        int []ans = new int[nums.length];
        for(int i = 0;i<ans.length;i++){
            ans[i] =left[i]*right[i]; 
        }
        return ans;
    }

}