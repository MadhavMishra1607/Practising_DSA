class Solution {
    public boolean canJump(int[] nums) {
        int current_end = 0;
        for(int i = 0;i<=current_end;i++){
            current_end = Math.max(current_end,i+nums[i]);
            if(current_end>=nums.length-1){
                return true;
            }
        }return false;
    }
}
