class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []res1 = new int[nums1.length];
        int []res2 = new int[nums2.length];
        for(int i =0;i<nums2.length;i++){
            res2[i] = -1;
        }
        Stack <Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums2.length;i++){
            while (!stack.isEmpty() && nums2[i]>nums2[stack.peek()]){
                res2[stack.peek()] =nums2[i];
                stack.pop();
            }
            stack.push(i);
            
        }
        for(int i=0; i<nums2.length;i++){
            map.put(nums2[i],res2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            res1[i] = map.get(nums1[i]);
        }
        return res1;
    }
}
