class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i] = new StringBuilder();
        }
        char[]arr =s.toCharArray();
        int j=0;
        while(j<arr.length){
            for(int index1=0;index1<numRows && j<arr.length;index1++){
                sb[index1].append(arr[j]);
                j++;
            }
            for(int index2=numRows-2;index2>0 && j<arr.length;index2--){
                sb[index2].append(arr[j]);
                j++;
            }
        }
        StringBuilder ans = new StringBuilder();
        ans.append(sb[0]);
        for(int z=1;z<numRows;z++){
            ans.append(sb[z].toString());
        }
        String res = ans.toString();
        return res;
    }
}
