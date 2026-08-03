class Solution {
    public boolean isHappy(int n) {
       Set<Integer> checked = new HashSet<>();
       while(!checked.contains(n)){
        checked.add(n);
        n = nextNum(n);
        if(n == 1){
            return true;
        }
       }
       return false;
    }
    private int nextNum(int n){
        int output = 0;
        while(n > 0){
            int digit = n % 10;
            output += digit * digit;
            n = n /10;
        }
        return output;
    }
}