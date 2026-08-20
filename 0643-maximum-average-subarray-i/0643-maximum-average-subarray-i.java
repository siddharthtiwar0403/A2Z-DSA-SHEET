class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        int bestSum = sum;
        int left = 0;
        int right = k;
        while(right < n){
            sum -= nums[left];
            left++;

            sum += nums[right];
            right++;
            bestSum = Math.max(sum,bestSum);
        }
        return (double) bestSum/k;
    }
}