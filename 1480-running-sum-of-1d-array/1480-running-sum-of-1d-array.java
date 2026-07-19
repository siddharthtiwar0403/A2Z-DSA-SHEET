class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        int add = 0;
        for(int num : nums){
            add += num;
            result[i] = add;
            i++;
        }
        return result;
    }
}