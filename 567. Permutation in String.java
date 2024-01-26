class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []arr = new int[128];
        char []s1_arr = s1.toCharArray();
        char []s2_arr = s2.toCharArray();
        for(char ch: s1_arr){
            ++arr[ch];
        }
        int i =0;
        int j=0;
        int count=0;
        String s = "";
        int len = Integer.MAX_VALUE;
        while(j< s2_arr.length){
            char current = s2_arr[j];
            if(--arr[current]>=0){
                count++;
            }
            
            while(count == s1_arr.length){
                int window = j-i+1;
                len = Math.min(len ,window);
                char left = s2_arr[i];
                if(++arr[left]>0){
                    count--;
                }i++;

            }j++;
        }return len == s1_arr.length;
    }
}
