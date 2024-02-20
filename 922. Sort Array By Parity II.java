class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else if(nums[i]%2!=0){
                odd.add(nums[i]);
            }
        }
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length/2;i++){
            arr[2*i] = even.get(i);
            arr[(2*i)+1] = odd.get(i); 
        }
        return arr;
    }
}