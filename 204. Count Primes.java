class Solution {
    public int countPrimes(int n) {
        
        int count=0;
        if(n<2){
            return 0;
        }
        boolean []arr=new boolean[n+1];
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i<=n;i++){
            arr[i]=false;
        }
        for(int i=2;i*i<=n;i++){
            if(arr[i]==false){
                for(int j=i*2;j<=n;j+=i){
                    arr[j]=true;
                }
            }
        }
        for(int i=1;i<n;i++){
            if(arr[i]==false){
                count+=1;
            }
        }
        return count;
    }
}
