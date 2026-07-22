class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i=1;
        int j=0;
        for(int pile:piles){
            j=Math.max(j,pile);
        }
        int ans=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(willWork(piles,mid)<=h){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans; 
    }
    public long willWork(int[] piles,int k){
        long hours = 0;

        for(int pile : piles){

            hours += (pile + (long)k - 1) / k;

        }
        return hours;
    }
}