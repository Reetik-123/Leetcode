class Solution {
    public int trap(int[] nums) {
        int n= nums.length;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        int ans=0;
        int left=0,right=0;
        for(int i=0;i<n;i++){
            if(left>nums[i]){
            leftmax[i] = left;
            }else{
                leftmax[i]=nums[i];
                left=nums[i];
            }
        }
        for(int i=n-1;i>=0;i--){
            if(right>nums[i]){
            rightmax[i] = right;
            }else{
                rightmax[i]=nums[i];
                right=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            ans+=Math.min(leftmax[i],rightmax[i])-nums[i];
        }
        return ans;
    }
}