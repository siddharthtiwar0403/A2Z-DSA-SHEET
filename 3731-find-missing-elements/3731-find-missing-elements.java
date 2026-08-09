class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            ans.add(num);
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = min; i <= max; i++){
            if(!ans.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}