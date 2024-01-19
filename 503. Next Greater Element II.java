class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int []res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = -1;
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                res[stack.peek()] = nums[i];
                stack.pop();
            }
            stack.push(i);
        }
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                res[stack.peek()] = nums[i];
                stack.pop();
            }
        }
        return res;
    }
}
