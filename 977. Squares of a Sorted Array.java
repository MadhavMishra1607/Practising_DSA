class Solution {
    public int[] sortedSquares(int[] nums) {
        int []arr =new int [nums.length];
        int i=0;int j= nums.length-1;
        int k = arr.length-1;
        while(k>=0){
            int a = nums[i]*nums[i];
            int b = nums[j]*nums[j];
            if(b>a){
                arr[k] = b;
                j--;
            }else{
                arr[k] = a;
                i++;
            }
            k--;
        }
        return arr;
    }
}
