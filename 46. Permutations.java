class Solution {
    public List<List<Integer>> permute(int[] nums) {
         
        ArrayList<Integer> list = new ArrayList<>();
        return permutation(list,nums);
    }
    public List<List<Integer>> permutation(ArrayList<Integer> list,int[] arr){
        List<List<Integer>> main =new ArrayList<>();
        if(list.size()==arr.length){
            main.add(new ArrayList<>(list));
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(list.contains(arr[i])){
                    continue;
                }
                list.add(arr[i]);
                main.addAll(permutation(list,arr));
                list.remove(list.size()-1);

            }
        }
        return main;
    }

}
