class Solution {
    public void nextPermutation(int[]arr) {
        int i=arr.length-1;
        int j=arr.length-2;
        while(j>=0){
            if(arr[i]>arr[j]){
                break; 
            }else{
                i--;
                j--;
            }
        }
        if(j>=0){
            int swapping_index = arr.length-1;
            while(swapping_index>0){
                if(arr[swapping_index] > arr[j]){
                    break;
                }else{
                    swapping_index--;
                }
            }
            swap(arr,j,swapping_index);
        }
        
        reverse(arr,i,arr.length-1);

    }
    public void swap(int [] arr,int a, int b){
        int temp =arr[a];
        arr[a] =arr[b];
        arr[b] =temp;
    }
    public void reverse(int [] arr,int a, int b){
        while(a<b){
            swap(arr,a,b);
            a++;
            b--;
        }
    }
    
}
