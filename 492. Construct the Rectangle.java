class Solution {
    public int[] constructRectangle(int area) {
        int[] arr =new int[2]; 
        int root = (int)Math.sqrt(area);
        int width = root;
        while(area%width>0){
            width--;
        }
        arr[0] = area/width;
        arr[1]=width;
        return arr;
        
    }
}
