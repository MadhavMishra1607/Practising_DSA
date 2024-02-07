class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length-1;
        if(ascii(target)<ascii(letters[0])){
            return letters[0];
        }
        else if(ascii(target)>=ascii(letters[n])){
            return letters[0];
        }
        else {
            int start = 0;
            int end = n;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(ascii(letters[mid])<=ascii(target)){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }return letters[start];
        }

    }
    static int ascii(char c){
        return (int)c;
    }
}
