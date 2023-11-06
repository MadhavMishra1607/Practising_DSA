class Solution {
    public String intToRoman(int num) {
        String ans = "";
        String [] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int [] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int i=0;
        while(i<str.length){
            if(num==0){
                return ans;
            }
            else if(num>=arr[i]){
                ans+= str[i];
                num-=arr[i];
            }
            else{
                i++;
            }
        }return ans;
    }
}
