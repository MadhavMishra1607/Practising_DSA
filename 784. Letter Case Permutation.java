class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        char[] arr = s.toCharArray();
        ArrayList<Character> nums = new ArrayList<>();
        for(int i=0;i<=9;i++){
            char ch = (char)('0'+i);
            nums.add(ch);
        }
        ans(list,nums,arr,0);
        return list;
    }
    public void ans(List<String> list,ArrayList<Character> nums,char[] arr, int i){
        if(i==arr.length){
            list.add(String.valueOf(arr));
            return;
        }
        if(nums.contains(arr[i])){
            ans(list,nums,arr,i+1);
        }
        else if(!nums.contains(arr[i])){
            arr[i] = Character.toLowerCase(arr[i]);
            ans(list,nums,arr,i+1);
            arr[i] = Character.toUpperCase(arr[i]);
            ans(list,nums,arr,i+1);
        }
    }
}
