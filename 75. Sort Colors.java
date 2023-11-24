class Solution {
    //merge sort
    public void sortColors(int[] nums) {
        int first = 0;
        int second = 0;
        int last = nums.length-1;
        while(second<=last){
            
            if(nums[second]==0){
                swap(nums,first,second);
                first++;
                second++;
                
            }
            else if(nums[second]==1){
                second++;
            }   
            else {
                swap(nums,second,last);
                last--;
            }
        }
    }
    public void swap(int[]nums,int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b] = temp;
    }
        
    
}
