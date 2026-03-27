class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length();
        String vowels = "AEIOUaeiou";
        int i = n - 1;
        while (i >= 0 && vowels.indexOf(s.charAt(i)) != -1) {
            i--;
        }
        return s.substring(0, i + 1);
    }
}