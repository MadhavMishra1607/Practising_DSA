class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []arr = new int[m+n];
        int i=0;
        int j=0;
        int a = 0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr[a] = nums1[i];
                i++;
            }
            else{
                arr[a] = nums2[j];
                j++;
            }
            a++;
        }
        while(i<m){
            arr[a] = nums1[i];
            i++;
            a++;
        }
        while(j<n){
            arr[a] = nums2[j];
            j++;
            a++;
        }

        for(int l = 0; l<nums1.length; l++){
            nums1[l] = arr[l];
        }
    }
}