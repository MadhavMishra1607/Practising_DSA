class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n =nums.length;
        int a = n/3;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i: map.keySet()){
            if(map.get(i)>a){
                list.add(i);
            }
        }
        return list;
    }
}
