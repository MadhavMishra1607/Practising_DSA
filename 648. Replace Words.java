class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] arr =sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<dictionary.size();j++){
                if(arr[i].startsWith(dictionary.get(j))){
                    arr[i] = dictionary.get(j);
                    continue;

                }
                continue;
                
            }
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            str.append(arr[i]);
            if(i!=arr.length-1){
                str.append(" ");
            }
        }
        return str.toString();
    }
}
