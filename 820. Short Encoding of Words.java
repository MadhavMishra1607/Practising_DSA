class Solution {
    public int minimumLengthEncoding(String[] words) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        for(int i=0;i<words.length;i++){
            set1.add(words[i]);
            set2.add(words[i]);
        }
        for(String s:set1){
            
            for(int j=0;j<s.length();j++){
                String sub = s.substring(j+1);
                if(set2.contains(sub)){
                    set2.remove(sub);
                }
            }
        }
        

        StringBuilder str = new StringBuilder();
        
        for(String word:set2){
            
            str.append(word);
            str.append("#");
        }
        return str.length();
    }
}
