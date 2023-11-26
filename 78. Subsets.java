class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        ArrayList <Integer> list = new ArrayList<>();
        return sub( list, nums,0);
        
    }
    public List<List<Integer>> sub(ArrayList <Integer> list,int []arr, int a){            
        List<List<Integer>> main = new ArrayList<>();
        main.add(new ArrayList<>(list));

            for(int i=a;i<arr.length;i++){
                list.add(arr[i]);
                main.addAll(sub(list,arr,i+1));
                list.remove(list.size()-1);
            }
            return main;
        
    }

}
