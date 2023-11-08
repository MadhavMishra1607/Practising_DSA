class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                s1.push(s.charAt(i));
            }
            else {
                
                if(s1.isEmpty()){
                    return false;
                }
                char bracket = s1.peek();
                char ch =s.charAt(i);
                if(ch==')' && bracket=='(' || ch==']' && bracket=='[' || ch=='}' && bracket=='{'){
                    s1.pop();
                }
                else {
                    return false;
                }
            }
        }
        if(s1.isEmpty()){
            return true;
        }return false;
    }
       
}
