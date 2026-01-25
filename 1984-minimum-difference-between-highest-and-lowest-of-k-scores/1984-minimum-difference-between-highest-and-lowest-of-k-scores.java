class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        if (k == 1) return 0;

        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i + k - 1 < n; i++) {
            int r = i + k - 1;
            diff = Math.min(diff, nums[r] - nums[i]);
        }

        return diff;
    }
}
