class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length == 1) return 0;
        final int n = nums.length;
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int i = 0, r = k -1; r < n;){
            diff = Math.min(diff, nums[r++] - nums[i++]);
        }
        return diff;
    }
}