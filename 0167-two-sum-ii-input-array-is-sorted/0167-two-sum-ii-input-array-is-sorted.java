class Solution {
    public int[] twoSum(int[] numbers, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = numbers.length - 1;
        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target) {
                result.add(left + 1);
                result.add(right + 1);
                break;
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}