class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> main = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int [] nums = {1,2,3,4,5,6,7,8,9};
        combination(main,list,nums,k,n,0);
        return main;
    }
    public void combination(List<List<Integer>> main,ArrayList<Integer> list,int [] nums,int size, int sum, int start){
        if(sum<0){
            return;
        }
        else if(sum==0 && list.size()==size){
            main.add(new ArrayList<>(list));
            return;
        }
        else{
            for(int i=start;i<nums.length;i++){
                list.add(nums[i]);
                combination(main,list,nums,size,sum-nums[i],i+1);
                list.remove(list.size()-1);
            }
        }
    }
}
