class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> main = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        combination(main,list,candidates,target,0);
        return main;

    }
    public void combination(List<List<Integer>> main,ArrayList<Integer> list,int[] arr, int target, int start){
        if(target ==0){
            main.add(new ArrayList<>(list));
            return;
        }
        if(target>0){
            for(int i=start;i<arr.length && arr[i]<=target;i++){
                if(i>start && arr[i]==arr[i-1]){
                    continue;
                }
                list.add(arr[i]);
                combination(main,list,arr,target-arr[i],i+1);
                list.remove(list.size()-1);
            }
        }
    }
}
