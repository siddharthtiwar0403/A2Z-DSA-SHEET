class Solution {
    public int findGCD(int[] nums) {
        int smallest = nums[0];
        int largest = nums[0];
        for(int num : nums){
            if(num < smallest) smallest = num;
            if(num > largest) largest = num;
        }
        return gcd(smallest,largest);
    }
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}