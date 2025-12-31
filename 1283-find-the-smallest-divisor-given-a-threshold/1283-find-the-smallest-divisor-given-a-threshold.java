class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = nums[0];
        int ans = -1;
        for(int i : nums){
            right = Math.max(right, i);
        }

        while(left <= right){
            int mid = (left + right) / 2;
            int sum = 0;

            for(int i = 0; i < nums.length; i++){
                sum += Math.ceil((double) nums[i] / (double)mid);
            }

            if(sum <= threshold){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}