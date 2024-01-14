class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int moves=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int increment = nums[i]- nums[0];
            moves+=increment;
        }
        return moves;
    }
}
