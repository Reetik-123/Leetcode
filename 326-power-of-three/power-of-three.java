class Solution {
    public boolean isPowerOfThree(int n) {
        boolean ans = rec(3,0,n);
        return ans;
    }
    public static boolean rec(long t,int cnt,int n){
        if(n==1)return true;
        if(cnt==n/2 || t>n){
            return false;
        }
        if(t==n){
            return true;
        }
        return rec(t*3,cnt+1,n);
    }
}