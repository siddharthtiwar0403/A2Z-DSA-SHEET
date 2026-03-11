class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int result = 1;
        while(result <= n){
            result = result << 1;
        }
        return (result - 1) ^ n;
    }
}