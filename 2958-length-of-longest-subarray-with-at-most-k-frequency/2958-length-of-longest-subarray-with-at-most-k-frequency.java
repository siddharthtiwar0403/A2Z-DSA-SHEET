class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> result = new HashMap<>();
        int i = 0, j = 0;
        int res = 0;
        while(j < nums.length){
            result.put(nums[j], result.getOrDefault(nums[j], 0) + 1);
            while(result.get(nums[j]) > k){
                result.put(nums[i], result.get(nums[i]) - 1);
                i++;
            }
            res = Math.max(res, j - i + 1);
            j++;
        }
        return res;
    }
}