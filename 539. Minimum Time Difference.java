class Solution {
    public int findMinDifference(List<String> timePoints) {
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0;i<timePoints.size();i++){
           String minute =timePoints.get(i); 
           
           if(minutes(minute)>720){
               list.add(minutes(minute));
           }
           else{
               list.add(minutes(minute));
               list.add(1440+minutes(minute));
           }    
       }
       HashMap<Integer, Integer>  map = new HashMap<>();
       for(int i : list){
           map.put(i,map.getOrDefault(i,0)+1);
           if(map.get(i)>=2){
               return 0;
           }
       }
       Collections.sort(list);
       int i=0;
       int j=1;
       int min=Integer.MAX_VALUE;
       while(j<list.size() && i<list.size()-1){
           int first = list.get(i);
           int last = list.get(j);
           min = Math.min(min,Math.abs(last-first));
           
            i++;
            j=i+1;
       }
       return min;
       
    }
    public int minutes(String str){
        String []arr = str.split(":");
        int ans= Integer.valueOf(arr[0])*60 +Integer.valueOf(arr[1]);
        return ans; 
    }
}
