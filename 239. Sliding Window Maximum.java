class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int [] arr =new int[nums.length-k+1];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(!q.isEmpty() && q.peek() == i-k){
                q.remove();
            }
            while(!q.isEmpty() && nums[q.peekLast()]< nums[i]){
                q.removeLast();
            }
            q.add(i);
            if(i>=k-1){
                arr[j] = nums[q.peek()];
                j++;
            }
            
            
        }return arr;
    }
}
