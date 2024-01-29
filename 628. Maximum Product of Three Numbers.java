class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int pro = 0;
        int n= nums.length;
        int last_pro=0;
        last_pro = nums[n-1]*nums[n-2]*nums[n-3];
        int first_pro = 0;
        
        first_pro=nums[0]*nums[1]*nums[n-1];
        pro = Math.max(last_pro,first_pro);
        return pro;
        
    }
}
