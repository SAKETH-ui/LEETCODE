import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] str) {
        StringBuilder res=new StringBuilder();

        Arrays.sort(str);
        String s1=str[0];
        String s2=str[str.length-1];
        for(int i=0;i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return res.toString();
            }
            else res.append(s1.charAt(i));
        }
        return res.toString();
    }
}