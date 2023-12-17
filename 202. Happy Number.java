class Solution {
    public boolean isHappy(int n) {
        // int sq =square(n); 
        
        while(n!=4 && n!=1){
            n=square(n);
        }
        System.out.println(n);
        if(n==1){
            
            return true;
        }return false;

    }public int square(int n){
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    
    }
}
