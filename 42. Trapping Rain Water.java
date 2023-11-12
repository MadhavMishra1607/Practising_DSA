class Solution {
    public int trap(int[] height) {
        int max = 0;
        for(int i=0;i<height.length;i++){
            if(height[i]>height[max]){
                max =i;
            }
        }
        int sum=0;
        int left = 0;
        for(int i=0;i<max;i++){
            left = Math.max(left, height[i]);
            sum+= (left-height[i]);
        }
        int right = height[height.length-1];
        for(int i=height.length-1;i>max;i--){
            right = Math.max(right,height[i]);
            sum+=(right-height[i]);
        }
        return sum;
    }
}
