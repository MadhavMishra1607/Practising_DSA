class Solution {
    public int removeDuplicates(int[] nums) {
        /*
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
        */
        int i=0;int j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                nums[i+1] = nums[j];
                i++;
            }
        }return i+1;
    }
}
