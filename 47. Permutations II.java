class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> main = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        Boolean[] used= new Boolean[nums.length];
        for(int i = 0;i< used.length;i++){
            used[i] = false;
        }
        permutation(main, list, nums,used);
        HashSet<List<Integer>> set = new HashSet<>(main);
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
    
    public void permutation(List<List<Integer>> main , ArrayList<Integer> list, int[] nums,Boolean[] used) {
        if (list.size() == nums.length) {
            main.add(new ArrayList<>(list));
            return;
        } 
     
            for (int i = 0; i < nums.length; i++) {
                if (list.contains(nums[i]) && used[i]) {
                    continue;
                }
                list.add(nums[i]);
                used[i] = true;
                permutation(main, list, nums,used);
                used[i] = false;
                list.remove(list.size() - 1);
            }
        
    }
}
