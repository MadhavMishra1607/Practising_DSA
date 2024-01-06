class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        ArrayList<Integer> main = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(list.contains(nums1[i])){
                main.add(nums1[i]);
                list.remove(Integer.valueOf(nums1[i]));
            }
        }
        int[] arr =new int[main.size()];
        for(int i=0;i<main.size();i++){
            arr[i] = main.get(i);
        }
        return arr;
        

    }
}
