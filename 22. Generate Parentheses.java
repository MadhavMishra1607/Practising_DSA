class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        braces(list, sb,n-1,1);
        return list;
    }
    public void braces(List<String> list,StringBuilder sb, int open, int close){
        if(open ==0 && close ==0){
            list.add(sb.toString());
            return;
        }
        if(open>0){
            sb.append('(');
            braces(list,sb,open-1,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close>0){
            sb.append(')');
            braces(list,sb,open,close-1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
