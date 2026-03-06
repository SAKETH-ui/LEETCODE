class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=0,b=0,n=(word1.length()+word2.length());
        String str="";
        while(a<word1.length()||b<word2.length()){
            if(a<word1.length())str+=word1.charAt(a++);
            if(b<word2.length())str+=word2.charAt(b++);
        }return str;
    }
}