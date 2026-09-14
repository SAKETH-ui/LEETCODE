class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        int level=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(level>0){
                    res+="(";
                }
                level++;
            }
            else{
                level--;
                if(level>0){
                    res+=")";
                }
            }
        }
        return res;
    }
}