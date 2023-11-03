class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []arr = merge(nums1,nums2);
        double median = 0.00d;
        int mid = arr.length/2;
        if(arr.length %2 ==0){
            double m = arr[mid]+arr[mid-1];
            median= m/2;
        }
        else if (arr.length%2!=0){
            median = arr[mid];
        }
        return median;
    }
    public int[] merge(int[]first,int[]second){
        int[]merge = new int[first.length+second.length];
        int i =0;
        int j=0;
        int k=0;
        while(i<first.length && j< second.length){
            if(first[i]<second[j]){
                merge[k] = first[i];
                i++;
            }
            else{
                merge[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            merge[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            merge[k]=second[j];
            j++;
            k++;
        }
        return merge;
    }
}