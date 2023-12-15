class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        int max=Integer.MIN_VALUE;
        int freq = 0;
        for(int i: map.keySet()){
            
            if(map.get(i)>max){
                freq= i;
            }
            max = Math.max(max, map.get(i));

        }
        return freq;
    }
}
