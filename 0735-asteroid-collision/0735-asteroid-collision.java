class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    ArrayList<Integer> list = new ArrayList<>();
    for(int curr : asteroids){
        boolean alive = true;
        while(alive && curr < 0 && !list.isEmpty() && list.get(list.size() - 1) > 0){
            int last = list.get(list.size() - 1);
            if(last < -curr){
                list.remove(list.size() - 1);
            }else if(last == -curr){
                list.remove(list.size() - 1);
                alive = false;
            }else{
                alive = false;
            }
        }
        if(alive){
            list.add(curr);
        }
    } 
    int[] ans = new int[list.size()];
    for(int i = 0; i < list.size(); i++){
        ans[i] = list.get(i);
    }
    return ans;
    }
}