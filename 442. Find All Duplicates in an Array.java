class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap (nums,i,correct);
            }
            else{
                i++;
            }
        }
        ArrayList<Integer>list =new ArrayList<>();
        for (int index=0;index<nums.length;index++){
            
            if(nums[index]!= index+1){
                list.add(nums[index]);
            }
        }return list;
    }
    public void swap(int[]arr,int n1,int n2){
        int temp = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;

    }
}
