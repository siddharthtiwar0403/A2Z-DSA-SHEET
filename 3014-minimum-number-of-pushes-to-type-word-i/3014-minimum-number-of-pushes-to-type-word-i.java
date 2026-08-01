class Solution {
    public int minimumPushes(String A) {
        int pushes = 0;
        for(int i = 0; i < A.length(); i++){
            pushes += (i / 8) + 1;
        }
    return pushes;
    }
}