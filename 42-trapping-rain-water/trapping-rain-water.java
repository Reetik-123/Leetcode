class Solution {
    public int trap(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;
        int lmax=0,rmax=0;
        int water=0;
        while(l<r){
            if(nums[l]<=nums[r]){
                lmax=Math.max(lmax,nums[l]);
                water+=lmax-nums[l];
                l++;
            }else{
                rmax=Math.max(rmax,nums[r]);
                water+=rmax-nums[r];
                r--;
            }
        }
        return water;
    }
}