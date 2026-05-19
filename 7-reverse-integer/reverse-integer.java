class Solution {
    public int reverse(int x) {
        long fl=0;
        if(x<0){
            fl=1;
            x=-x;
        }
        long ans=0;
        while(x>0){
            long j = x%10;
            ans =ans*10+j;
            x=x/10;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE) return 0;
        if(fl==1) return (int)-ans;
        else return (int)ans;
    }
}