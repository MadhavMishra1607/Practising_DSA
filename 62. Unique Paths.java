class Solution {
    public int uniquePaths(int m, int n) {
        
        int [][]dp  =new int[m+1][n+1];
        return unique(m,n,dp);
        
    }
    public int unique(int m, int n,int [][]dp) {
        if(m==1 || n==1){
            return 1;
        }
        else if(dp[m][n]!=0){
            return dp[m][n];
        }

        int down = unique(m-1,n,dp);
        int right = unique(m,n-1,dp);
        int count = down+right;
        dp[m][n] =count; 
        
        return count;
    }

}