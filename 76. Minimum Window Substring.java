
class Solution {
    public String minWindow(String s, String t) {
        int []arr = new int[128];
        char []s_arr = s.toCharArray();
        char []t_arr = t.toCharArray();
        for(char ch : t_arr){
            ++arr[ch];
        }
        int i=0;
        int j=0;
        int count=0;
        int len=Integer.MAX_VALUE;
        String ans = "";
        while(j<s_arr.length){
            char current = s_arr[j];
            if(--arr[current]>=0){
                count++;
            }while(count == t_arr.length){
                if(len > j-i+1){
                    len=j-i+1;
                    ans = s.substring(i,j+1);
                }
                char left = s_arr[i];
                if(++arr[left]>0){
                    count--;
                }i++;
            }j++;
        }return ans;
    }
}