class Solution {
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder();
        char[] ch= s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                list.add(ch[i]);
            }
        }
        System.out.println(list);
        

        char[] arr =new char[ch.length];
        for(int i=0;i<arr.length;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                int n=list.size();
                ch[i] = list.get(n-1);
                list.remove(n-1);
                
            }
            str.append(ch[i]);
        }
        return str.toString();

        //return s;
    }
}
