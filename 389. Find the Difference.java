class Solution {
    public char findTheDifference(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        if(sarr.length==0){
            return tarr[0];
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<tarr.length;i++){
            map.put(tarr[i],map.getOrDefault(tarr[i],0)+1);
        }
        HashMap<Character,Integer> hash = new HashMap<>();
        for(int i=0;i<sarr.length;i++){
            hash.put(sarr[i],hash.getOrDefault(sarr[i],0)+1);
        }
        for(char c: map.keySet()){
            if(!hash.containsKey(c)){
                return c;
            }
            else if(map.get(c)!=hash.get(c)){
                return c;
            }
        }
        return tarr[t.length()-1];
    }
}
