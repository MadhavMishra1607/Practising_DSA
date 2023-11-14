class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap <String,List<String>> map = new HashMap<>();
        for(String s1:strs){
            String s2=sorted(s1);
            if(map.containsKey(s2)){
                map.get(s2).add(s1);
            }
            else{
                ArrayList <String> ans = new ArrayList<>();
                ans.add(s1);
                map.put(s2,ans);
                list.add(ans);
            }
        }
        
        return list;
    }
    public String sorted(String s){
        char[]arr = s.toCharArray();
        Arrays.sort(arr);
        String str =Arrays.toString(arr);
        return str; 
    }
}
