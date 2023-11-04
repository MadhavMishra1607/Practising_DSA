class Solution {
    public boolean isPalindrome(int x) {
       int palin = palindrome(x);
       if(palin == x){
           return true;
       }
       else{
           return false;
       }
    }
    public int palindrome(int num){
        int p = 0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            int a = 10*p;
            p = a+rem;
         
        }
        return p;
    }
}
