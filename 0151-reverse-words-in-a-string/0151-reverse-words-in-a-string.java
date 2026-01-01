class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        StringBuilder W  = new StringBuilder();
        for(int i = word.length - 1;i >= 0; i-- ){
            W.append(word[i]);
            if(i != 0){
                W.append(" ");
            }
        }
    return W.toString();
    }
}