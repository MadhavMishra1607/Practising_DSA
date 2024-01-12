class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list= new ArrayList<>();      
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int j =0;j<nums.length;j++){
            if(j!= nums[j]-1){
                list.add(j+1);
            }
        }return list;
        
    }
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] =arr[b];
        arr[b] = temp;
    }
}
