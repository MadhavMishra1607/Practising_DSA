class Solution {
    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            ch = Character.toLowerCase(ch);
            str.append(ch);
        }
        return str.toString();
    }
}
