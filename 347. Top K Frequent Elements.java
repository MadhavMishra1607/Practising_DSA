class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       

       HashMap<Integer,Integer> map = new HashMap<>();
       
       for(int i= 0; i < nums.length; i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       int arr[] = new int[k];
       int j = 0;
       for(int i = 0 ; i< k ;i++){
           int freq = 0;
           int max = 0;
           for(Map.Entry<Integer,Integer> val : map.entrySet()){
               if(val.getValue() > freq){
                   freq = val.getValue();
                   max = val.getKey();
               }
           }
            map.put(max,0);
            arr[j] = max;
            j++;
       }
       return arr;
    }
}
