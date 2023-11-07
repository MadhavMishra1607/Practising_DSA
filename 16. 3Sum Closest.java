class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int gap =Integer.MAX_VALUE;
        int n= nums.length ;
        
        int ans =0;
        for(int i=0;i<n;i++){
            int p1=i+1;
            int p2=n-1;
            while(p1<p2){
                int sum = nums[i]+nums[p1]+nums[p2];
                if(sum==target){
                    return target;
                    
                }else if(sum<target){
                    p1++;
                }else{p2--;}
                int c_gap= Math.abs(sum-target);
                if(gap>c_gap){
                    gap = c_gap;
                    ans =sum;
                }
                
            }
            
            
        }return ans;
    }
}
