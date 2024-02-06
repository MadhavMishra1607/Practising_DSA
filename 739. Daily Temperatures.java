class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack <Integer> stack = new Stack<>();
        int []arr = new int[temp.length];
        for(int i=0;i<temp.length;i++){
            arr[i] = 0;
        }
        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[stack.peek()]<temp[i]){
                int top = stack.pop();
                arr[top] = i-top;
            }stack.push(i);
        }
        return arr;
    }
}
