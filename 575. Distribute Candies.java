class Solution {
    public int distributeCandies(int[] c) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int max_candi_type = 0;

        for(int i = 0;i< c.length;i++){
            min = Math.min(c[i],min);
            max = Math.max(c[i],max);

        }
        boolean [] arr =  new boolean[max-min+1];
        for(int i = 0;i<c.length;i++){
            int j = c[i]-min;

            if(!arr[j]){
                arr[j] = true;
                max_candi_type++;
            }
        }return Math.min(max_candi_type, c.length/2);
        
    }
}

