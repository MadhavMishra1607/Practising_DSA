class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i=0;
        int j= arr.length-1;
        int sum =0;
        int []nums = {-1,-1}; 
        while(i<j){
            sum = arr[i]+arr[j];
            if(sum== target){
                nums[0] = i+1;
                nums[1] = j+1;
                return nums;
            }
            else if(sum<target){
                i++;

            }
            else{
                j--;
            }
        }return nums;
    }
}
