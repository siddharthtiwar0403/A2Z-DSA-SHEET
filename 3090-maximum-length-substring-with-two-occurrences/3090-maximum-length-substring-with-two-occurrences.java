class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> result = new HashMap<>();
        int i = 0;
        int maxlen = 0;
        for(int j = 0; j < s.length(); j++){
            char leftchar = s.charAt(j);
            result.put(leftchar, result.getOrDefault(leftchar, 0) + 1);

            while(result.get(leftchar) > 2){
                char rightchar = s.charAt(i);
                result.put(rightchar, result.getOrDefault(rightchar, 0) - 1);
                i++;
            }
            maxlen = Math.max(maxlen, j - i + 1);
        }
        return maxlen;
    }
}