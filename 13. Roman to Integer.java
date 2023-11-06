class Solution {
    public int romanToInt(String s) {
        HashMap <Character,Integer>map =new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans =0;
        char []arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(i<(arr.length-1) && map.get(arr[i])<map.get(arr[i+1])) {
                ans-=map.get(arr[i]);
            }
            else{
                ans+=map.get(arr[i]);
            }
        }return ans;
    }
}
