class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            for(int j=0;j<needle.length();j++){
                if(needle.charAt(j)!=haystack.charAt(i+j)){
                    break;
                }
                if(j==needle.length()-1){
                    return i;
                }
                if(i+j== haystack.length()-1){
                    return -1;
                }
                
    
            }

        }return -1;
        
    }
}