class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        ArrayList<Character> key = new ArrayList<>();
        ArrayList<Integer> val = new ArrayList<>();
        for(char ch: map.keySet()){
            key.add(ch);
            val.add(map.get(ch));
        }
        ArrayList<Integer> copy = new ArrayList<>(val);
        Collections.sort(val,Collections.reverseOrder());
        ArrayList<String> str = new ArrayList<>();
        for(int i=0;i<val.size();i++){
            int a = val.get(i);
            int ind = copy.indexOf(a);
            char c = key.get(ind);
            int j = str.size();
            String st = String.valueOf(c);
            str.add(j,st.repeat(a));
            key.remove(ind);
            copy.remove(ind);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.size();i++){
            sb.append(str.get(i));
        }
        return sb.toString();
    }
}
