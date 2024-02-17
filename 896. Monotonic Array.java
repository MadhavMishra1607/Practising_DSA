class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        if(nums[0]>nums[1]){
            return isMonoDecreasing(nums);
        }
        else if(nums[0]<nums[1]){
            return isMonoIncreasing(nums);
        }
        else if(nums[0]==nums[1]){
            for(int i=1;i<nums.length-1;i++){
                if(nums[i]!=nums[i+1]){
                    if(nums[i]<nums[i+1]){
                        return isMonoIncreasing(nums);
                    }
                    else if(nums[i]>nums[i+1]){
                        return isMonoDecreasing(nums);
                    }
                }
                else {continue;}
            }
        }
        return true;
    }
    public boolean isMonoIncreasing(int[] arr){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public boolean isMonoDecreasing(int[] arr){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
