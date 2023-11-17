class Solution {
    public int lengthOfLastWord(String s) {
        // s.trim();
        // String [] arr = s.split(" ");
        // System.out.println(Arrays.toString(arr));
        // int n = arr.length;
        // String str = arr[n-1];
        // int ans = str.length();
        // return ans;

        int length = 0;
		
		// We are looking for the last word so let's go backward
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { // a letter is found so count
                length++;
            } else {  // it's a white space instead
				//  Did we already started to count a word ? Yes so we found the last word
                if (length > 0) return length;
            }
        }
        return length;
    }
}
