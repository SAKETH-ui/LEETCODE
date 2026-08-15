import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] str) {
        String s="";
        if(str.length==0)return "";
            for(int i=0;i<str[0].length();i++){
                for(int j=0;j<str.length;j++){
                    
                    if(i==str[j].length()||str[0].charAt(i)!=(str[j].charAt(i))){
                        return s;
                    }
                }
                s+=str[0].charAt(i);
            }
            
            return s;
    }
}