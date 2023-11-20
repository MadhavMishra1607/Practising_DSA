class Solution {
    public int[] plusOne(int[] nums){
        for(int i= nums.length-1;i>=0;i--){
            if(nums[i]!=9){
                nums[i]+=1;
                return nums;
            }
            else{
                nums[i]=0;
            }
        }
        // nums = new int[nums.length+1];
        // nums[0]=1;
        // return nums;
        int[] arr = new int[nums.length+1];
        arr[0] = 1;
        for(int i=1;i<arr.length;i++){
            arr[i]= 0;
        }
        return arr;


    }

    // public int[] plusOne(int[] digits) {
    //     long num=0;
    //     for(int i=0;i<digits.length;i++){
    //         int a = digits[i];
    //         num = num*10+a;
    //     }
    //     long n= num+1;
    //     if(n > Integer.MAX_VALUE){
    //         int len = digits.length;
    //         if(digits[len-1]==9){
    //             digits[len-1]=0;
    //             digits[len-2]+=1;
    //         }else{
    //            digits[len-1]+=1; 
    //         }
            
    //         return digits;
    //     }
    //     System.out.println(n);
    //     Stack<Integer> stack = new Stack<>();
    //     while(n>0){
    //         stack.push((int)(n%10));
    //         n/=10;
    //     }
    //     int size = stack.size();
    //     int [] arr = new int[size];
    //     for(int i=0;i<arr.length;i++){
    //         arr[i] = stack.pop();
    //     }
    //     return arr;

    // }
}
