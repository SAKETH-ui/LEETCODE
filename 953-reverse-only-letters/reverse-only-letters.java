class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0,j=sb.length()-1;
        while(i<j){
            if(Character.isLetter(sb.charAt(i))&&Character.isLetter(sb.charAt(j))){
                char ch=sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,ch);
             i++;
             j--;
            }
            
             while(!Character.isLetter(sb.charAt(i))&&i<j)i++;
             while(!Character.isLetter(sb.charAt(j))&&i<j)j--;
        }
        return sb.toString();
    }
}