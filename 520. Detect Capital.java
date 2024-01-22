class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1){
            return true;
        }
        char ch = word.charAt(0);
        if(Character.isLowerCase(ch)){
            for(int i=1;i<word.length();i++){
                char it = word.charAt(i);
                if(!Character.isLowerCase(it)){
                    return false;
                }
            }
        }else if(Character.isUpperCase(ch)){
            char cha =word.charAt(1);
            if(Character.isUpperCase(cha)){
                for(int j=2;j<word.length();j++){
                    char it = word.charAt(j);
                    if(!Character.isUpperCase(it)){
                        return false;
                    }
                }
            }
            else if (Character.isLowerCase(cha)){
                for(int j=2;j<word.length();j++){
                    char it = word.charAt(j);
                    if(!Character.isLowerCase(it)){
                        return false;
                    }
                }
            }

        }return true;
    }
}
