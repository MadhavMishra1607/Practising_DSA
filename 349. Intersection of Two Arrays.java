class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        
        HashSet<Integer> list1 = new HashSet<>();
        

        for(int i=0;i<nums1.length;i++){
            // if(list1.contains(nums1[i])){
            //     continue;
            // }
            list1.add(nums1[i]);
        }
        
        
        
        // ArrayList<Integer> list11 = new ArrayList<>();
        ArrayList<Integer> list22 = new ArrayList<>();
        for(int j1=0;j1<nums2.length;j1++){
            if(list1.contains(nums2[j1])&& !list22.contains(nums2[j1])){
                
                list22.add(nums2[j1]);
            }
            
        }
        int[] arr= new int[list22.size()];
         for(int ind=0; ind<arr.length;ind++){
             arr[ind] = list22.get(ind);

         }
         return arr;
        
        
    }
}
