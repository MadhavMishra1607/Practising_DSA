class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        int n = list.size();
        Collections.sort(list);
        if(n<3){
            return(list.get(n-1));
        }
        return list.get(n-3);
    }
}
