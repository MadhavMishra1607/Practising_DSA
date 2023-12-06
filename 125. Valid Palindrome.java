class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<26;i++){
            char ch = (char)('a' + i);
            list.add(ch);
        }
        for(int i=0;i<=9;i++){
            char c = (char)(i+'0');
            list.add(c);
        }
        System.out.println(list);
        char []arr = s.toCharArray();
        ArrayList<Character> main = new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            arr[j]=Character.toLowerCase(arr[j]);
            if(list.contains(arr[j])){
                main.add(arr[j]);
            }
            else{
                continue;
            }
        }
        int start =0;
        int end = main.size()-1;
        while(start<end){
            if(main.get(start) != main.get(end)){
                return false;
            }
            start++;
            end--;
        }return true;
        
    }
}
