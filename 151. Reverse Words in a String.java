class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        s=s.trim();
        System.out.println(s);
        String[] arr = s.split("\\s+"); // for splitting more than one whitespace
        
        for(int i=arr.length-1;i>=0;i--){
            
            str.append(arr[i]);
            if(i>0){
                str.append(" ");
            }
        }
        return str.toString();
    }
}
