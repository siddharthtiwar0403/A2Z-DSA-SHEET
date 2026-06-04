class Solution {
    private int result(int x){
        String S = Integer.toString(x);
        int count = 0;

        for(int i = 1; i < S.length() - 1; i++){
            char cur = S.charAt(i);

            if((cur > S.charAt(i - 1) && cur > S.charAt(i + 1)) || (cur < S.charAt(i - 1) && cur < S.charAt(i + 1))) count++;
        }
        return count;
    }
    public int totalWaviness(int num1, int num2) {
      int ans = 0;
      for(int x = num1; x <= num2; x++){
        ans += result(x);
      }  
      return ans;
    }
}