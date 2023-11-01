class Solution {
    public int lengthOfLongestSubstring(String s) {
        char []arr = s.toCharArray();
        int n = arr.length;
        int i=0;
        int j=0;
        int length =0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<n){
            
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            while(map.size()< j-i+1){
                map.put(arr[i],map.get(arr[i])-1);
                if(map.get(arr[i])==0){
                    map.remove(arr[i]);

                }i++;
            }length = Math.max(length,j-i+1);
            j++;

        }return length;
    }
}
