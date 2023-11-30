class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();
        int [] leftsmall = new int[heights.length];
        int [] rightsmall = new int[heights.length];
        for(int i = 0;i<heights.length;i++){
            while(!left.isEmpty() && heights[left.peek()]>=heights[i]){
                left.pop();
            }
            if(left.isEmpty()){
                leftsmall[i] = 0;
            }else{
                leftsmall[i] = left.peek()+1;
            }
            left.push(i);
        }
        for(int i =heights.length-1;i>=0;i--){
            while(!right.isEmpty() && heights[right.peek()]>=heights[i]){
                right.pop();
            }
            if(right.isEmpty()){
                rightsmall[i] = heights.length-1;
            }else{
                rightsmall[i] = right.peek()-1;
            }
            right.push(i);
        }
        int max=0;
        for(int i = 0;i<heights.length;i++){
            int area = (rightsmall[i]-leftsmall[i]+1)*heights[i];
            max = Math.max(max,area);
        }
        return max;
    }
}
