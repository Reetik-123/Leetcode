class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] Matrix1 = new int[m][n];

        // Iterate through each element and copy it
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Matrix1[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            int cnt=0;
            for (int j = 0; j < n; j++) {
                if(Matrix1[i][j] == 0){
                    cnt=1;
                    for(int k=0;k<m;k++){
                        matrix[k][j]=0;
                    }
                }
            }
            if(cnt==1){
                for(int j=0;j<n;j++){
                    matrix[i][j]=0;
                }
            }else{
                continue;
            }
        }
    }
}