class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRow(matrix);
    }
    public void transpose(int [][]arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public void reverseRow(int [][]arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int start = 0, end = n - 1;
            while(start < end){
                int temp = arr[i][start];
                arr[i][start++] = arr[i][end];
                arr[i][end--] = temp;
            }
        }
    }

}