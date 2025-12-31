class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0,right = arr.length;
        while(left < right){
            int mid = (left + right) / 2;
            if(arr[mid] - 1 - mid < k){
                left = mid + 1;
            }else right = mid;
        }
        return left + k;
    }
}