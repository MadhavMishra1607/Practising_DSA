class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();  // Corrected this line
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<ss.length;i++){
            if(ss[i]=='#'){
                if (s1.length() > 0) {
                    s1.deleteCharAt(s1.length()-1);
                }
            }
            else {
                s1.append(ss[i]);
            }
        }
        StringBuilder t1 = new StringBuilder();
        for(int i=0;i<tt.length;i++){
            if(tt[i]=='#'){
                if (t1.length() > 0) {
                    t1.deleteCharAt(t1.length()-1);
                }
            }
            else {
                t1.append(tt[i]);  // Corrected this line
            }
        }
        return s1.toString().equals(t1.toString());
    }
}

   
