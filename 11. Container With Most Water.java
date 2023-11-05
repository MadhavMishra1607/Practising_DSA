class Solution {
    public int maxArea(int[] h) {
        int area = 0;
        int i =0;
        int j = h.length-1;
        while(i<j){
            if(h[i]<=h[j]){
                area = Math.max(area, (j-i)*h[i]);
                i++;
            }
            else{
                area = Math.max(area, (j-i)*h[j]);
                j--;
            }
            
        }return area;
    }
}