class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> main = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        palinpartition(main,list,s,0);
        return main;

    }

    public void palinpartition(List<List<String>> main, ArrayList<String> list, String s,int start){
        if(start== s.length()){
            main.add(new ArrayList<>(list));
            return;
        }
        else{
            for(int i=start;i<s.length();i++){
                if(palindrome(s,start,i)){
                    list.add(s.substring(start,i+1));
                    palinpartition(main,list,s,i+1);
                    list.remove(list.size()-1);
                }
            }
        }

    }

    public boolean palindrome(String s,int start, int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
