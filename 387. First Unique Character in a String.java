class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        ArrayList<Character> list = new ArrayList<>();
        for(char key: map.keySet()){
            if(map.get(key)==1){
               list.add(key);
            }
        }
        for(int i=0; i<s.length(); i++){
            if(list.contains(s.charAt(i))){
                return i;
            }
            
        }
        return -1;
    }
}
