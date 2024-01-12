class Solution {
    public int characterReplacement(String s, int k) {
        char[] arr = s.toCharArray();
        int i=0;
        int j=0;
        int len= 0;
        int freq=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<arr.length){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            freq = Math.max(map.get(arr[j]),freq); 
            if(((j-i+1)- freq)>k){
                map.put(arr[i],map.get(arr[i])-1);
                i++;
            }
            len= Math.max(len, j-i+1);
            j++;
        }return len;

    }
}
