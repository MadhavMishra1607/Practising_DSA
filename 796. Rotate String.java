class Solution {
    public boolean rotateString(String s, String goal) {
       StringBuilder str = new StringBuilder(goal);
    
       int n = str.length();

       while(n>0){
           if(str.toString().equals(s)){
               return true;
           }
           char ch = str.charAt(0);
           str.deleteCharAt(0);
           str.append(ch);
           n--;

       }return false;

       

    }
}
