class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> everyline  =new ArrayList<>();
        everyline.add(1);
        list.add(everyline);
        for(int i=1;i<numRows;i++){
            ArrayList<Integer> ans  =new ArrayList<>();
            ans.add(1);
            for(int j=1;j<i;j++){
                ans.add(everyline.get(j)+everyline.get(j-1));
            }
            ans.add(1);
            everyline = ans;
            list.add(ans);
        }
        return list;
    }
}
