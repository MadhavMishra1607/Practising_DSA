class Solution {
    public int addDigits(int num) {
        while(digit(num)>1){
            num = sum(num);
        }
        return num;
    }
    public int digit(int n){
        int count=0;
        while(n>0){
            count+=1;
            n/=10;
        }
        return count;
    }
    public int sum(int n){
        int sum=0;
        while(n>0){
            int rem =n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }

}
