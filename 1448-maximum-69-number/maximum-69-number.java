class Solution {
    public int maximum69Number (int num) {
        StringBuilder s=new StringBuilder();
        s.append(num);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='6'){
                s.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(s.toString());
    }
}