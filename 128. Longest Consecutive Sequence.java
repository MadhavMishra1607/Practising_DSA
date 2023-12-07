class Solution {
    
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int best = 0;
        for (int x : numSet) {
            if (!numSet.contains(x - 1)) {
                int y = x + 1;
                while (numSet.contains(y)) {
                    y++;
                }
                best = Math.max(best, y - x);
            }
        }
        return best;
    }
}
