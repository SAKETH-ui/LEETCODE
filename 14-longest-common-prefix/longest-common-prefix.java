import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] str) {
        String s="";
        if(str.length==0)return "";
            s+=str[0];
            int i=1;
            while(s.length()!=0&&i<str.length){
                if(!str[i].startsWith(s)){
                    s=s.substring(0,s.length()-1);
                }else {
                    i++;
                }
                if(s.length()==0)return "";
            }
            return s;
    }
}