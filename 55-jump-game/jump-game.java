class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        int ans=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<ans){
                ans--;
            }
            else if(nums[i]==ans){
                ans=nums[i];
            }
            else{
                ans=nums[i];
            }
            if(ans==0) return false;
        }
        return true;
    }
}