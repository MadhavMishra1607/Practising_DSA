class Solution {
    public int fib(int n) {
        int [] dp = new int[n+1];
        return fibo_dp(n,dp);
    }
    public int fibo_dp(int n,int [] dp){
        if(n==0||n==1){
            return n;
        }
        else if(dp[n]!=0){
            return dp[n];
        }
        int n1 = fibo_dp(n-1,dp);
        int n2 = fibo_dp(n-2,dp);
        int ans=n1+n2;
        dp[n]=ans;
        return ans;

    }
}
