class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch))sb.append(ch);
        }
        sb=sb.reverse();
        StringBuilder ans=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!Character.isLetter(ch))ans.append(ch);
            else
            {ans.append(sb.charAt(j));
            j++;}
            //if(j==sb.length())break;
        }
        return ans.toString();
    }
}