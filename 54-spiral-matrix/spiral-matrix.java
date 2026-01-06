class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> res = new ArrayList<>();
        if(mat.length==0) return res;
        int m=mat.length,n=mat[0].length;
        int srow=0,scol=0;
        int erow=m-1,ecol=n-1;
        while(srow<=erow && scol<=ecol){
            for(int i=scol;i<=ecol;i++){
                res.add(mat[srow][i]);
            }
            srow++;
            for(int j=srow;j<=erow;j++){
                res.add(mat[j][ecol]);
            }
            ecol--;
            if(srow<=erow){
                for(int i=ecol;i>=scol;i--){
                res.add(mat[erow][i]);
                }
                erow--;
            }
            if(scol<=ecol){

            for(int j=erow;j>=srow;j--){
                res.add(mat[j][scol]);
            }
            scol++;
            }
        }
        return res;
    }
}