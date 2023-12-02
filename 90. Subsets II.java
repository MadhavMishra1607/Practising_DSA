class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        return subsets(list,nums,0);
    }
    public List<List<Integer>> subsets( ArrayList<Integer> list,int []arr, int start){
        List<List<Integer>> main = new ArrayList<>();
        main.add(new ArrayList<>(list));
        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i]==arr[i-1]){
                continue;
            }
            list.add(arr[i]);
            main.addAll(subsets(list, arr, i+1));
            list.remove(list.size()-1);
        }
        return main;
    }
}
