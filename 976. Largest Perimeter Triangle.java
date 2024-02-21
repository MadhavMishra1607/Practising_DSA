class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        int sum=0;
        for(int i=0;i<n-2;i++){
            
            if(nums[i]+nums[i+1]>nums[i+2]){
                
                sum = Math.max(sum,nums[i]+nums[i+1]+nums[i+2]);
            }
        }return sum;
    }
}
