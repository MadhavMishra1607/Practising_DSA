class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list= new ArrayList<>();

        for(int i=left;i<=right;i++){
            if(digits(i)){
                list.add(i);
            }
        }  
        return list;
    }
    public boolean digits(int n){
        int x=n;
        List<Integer> list = new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n/=10;
        }
        if(list.contains(0)){
            return false;
        }
        for(int a=0;a<list.size();a++){
            if(x%list.get(a)!=0){
                return false;
            }
        }
        return true;
        
    }

}
