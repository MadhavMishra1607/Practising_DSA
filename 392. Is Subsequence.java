class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        else if(t.isEmpty()){
            return false;
        }
        char ch = s.charAt(0);
        char c = t.charAt(0);
        if(ch==c){
            return isSubsequence(s.substring(1,s.length()), t.substring(1,t.length()));
        }
        else{
            return isSubsequence(s, t.substring(1,t.length()));
        }
        
    }
}
