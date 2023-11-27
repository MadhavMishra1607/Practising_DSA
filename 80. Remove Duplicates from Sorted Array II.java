class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int count=0;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                count=0;
                i++;
                nums[i]=nums[j];
                
            }
            else if(nums[i]== nums[j] && count<1){
                count++;
                i++;
                nums[i]=nums[j];
            }
            j++;
        }return i+1;
    }
}
