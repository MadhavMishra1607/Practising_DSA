class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> list = new ArrayList<>();
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        HashMap<String,Integer> h1 = new HashMap<>();
        HashMap<String,Integer> h2 = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            h1.put(arr1[i],h1.getOrDefault(arr1[i],0)+1);
        
        }
        for(int j=0;j<arr2.length;j++){
            
            h2.put(arr2[j],h2.getOrDefault(arr2[j],0)+1);
        }
        for(String str1:h1.keySet()){
            if(h1.get(str1)==1){
                if(!h2.containsKey(str1)){
                    list.add(str1);
                }
            }
        
        }
        for(String str2:h2.keySet()){
            if(h2.get(str2)==1){
                if(!h1.containsKey(str2)){
                    list.add(str2);
                }
            }
        
        }
        String[] arr = new String[list.size()];
        for(int a=0;a<list.size();a++){
            arr[a]=list.get(a);
        }
        return arr;
        
    }
}
