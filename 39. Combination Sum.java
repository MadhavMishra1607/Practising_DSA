class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> main = new ArrayList<>();
        Arrays.sort(candidates);
        combination(new ArrayList<>(), main ,candidates, target,0);
        return main;
    }
    
    public void combination(ArrayList<Integer> list, List<List<Integer>> main  ,int[] arr, int target, int start) {
        if(target<0){return;}
        else if (target == 0) {
            main.add(new ArrayList<>(list)); 
        }
        else{
            for (int i = start; i < arr.length; i++) {
                list.add(arr[i]); 
                combination(list,main, arr, target - arr[i], i); 
                list.remove(list.size() - 1);
            }
        }
        
    }
}
