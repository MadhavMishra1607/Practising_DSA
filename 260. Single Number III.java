class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)==1){
                list.add(i);
            }
        }
        int []arr = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
