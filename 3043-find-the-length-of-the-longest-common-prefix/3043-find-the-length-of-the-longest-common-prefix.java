class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int length = 0;
        HashSet<Integer> result = new HashSet<>();
        for(int num : arr1){
            while(num > 0){
                result.add(num);
                num /= 10;
            }
        }
        for(int num : arr2){
            while(num > 0){
                if(result.contains(num)){
                    int prefixLength = String.valueOf(num).length();
                    if(prefixLength > length){
                        length = prefixLength;
                    }
                    break;
                }
                num /= 10;
            }
        }
        return length;
    }
}