class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[]arr = new int[2];
        arr[0] = first(nums,target);
        arr[1] = last(nums,target);
        return arr;
    }
    public int first(int[]nums,int target){
        int s = 0;
        int ans1 = -1;
        int e = nums.length-1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]== target){
                ans1 = mid;
                e = mid-1;

            }
            else if(nums[mid]<target){
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        
        }return ans1;

    }
    public int last(int[]nums,int target){
        int s = 0;
        int ans2 = -1;
        int e = nums.length-1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]== target){
                ans2 = mid;
                s= mid+1;

            }
            else if(nums[mid]<target){
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        
        }return ans2;

    }
}
