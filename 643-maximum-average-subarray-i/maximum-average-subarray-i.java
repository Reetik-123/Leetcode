class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int sum=0;
        int msum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];

        }
        msum=sum;
        for(int i=k;i<n;i++){
            sum=sum-nums[i-k]+nums[i];
            if(sum>=msum){
                msum=sum;
            }
        }
        return(double)msum/k;
    }    
}