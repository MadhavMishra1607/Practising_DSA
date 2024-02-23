class Solution {
    public int longestOnes(int[] nums, int k) {
       

        int i =0;
        int j=0;
        int count =0;
        int len = 0;
        int n = nums.length;
        while(i<n && j<n){
            if(nums[j]==0){
                count++;
            }
            while(count>k){
                if(nums[i] == 0) {
                    count--;
                }
                i++;
            }
            len = Math.max(len,j-i+1);
            j++;
        }
        return len;

    }
}
