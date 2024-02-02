class Solution {
    public int calPoints(String[] op) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<op.length;i++){
            if(!op[i].equals("+") &&!op[i].equals("C")&&!op[i].equals("D")){
                int num = Integer.parseInt(op[i]);
                list.add(num);
                
            }
            
            else if(op[i].equals("C")&& list.size()>0){
                list.remove(list.size()-1);
                
            }
            else if(op[i].equals("D") ){
                list.add(list.get(list.size()-1)*2);
                
            }
            else if(op[i].equals("+") ){
                int add = list.get(list.size()-1)+list.get(list.size()-2);
                
                list.add(add);
                
            }

        }
        for(int j=0;j<list.size();j++){
            sum+=list.get(j);
        }
        return sum;   

    }
}
