class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
        StringBuilder result = new StringBuilder(word).reverse();
        if(word.equals(result.toString())) return word;
       }
        return "";
    }
}