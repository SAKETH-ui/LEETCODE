class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        int level=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                level++;
                if(level>1){
                    res+="(";
                }
            }
            else if(ch==')'){
                if(level>1){
                    res+=")";
                }
                level--;
            }
        }
        return res;
    }
}