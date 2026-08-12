class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        int ans=nums[0];
        for(int i=0;i<nums.length-1;i++){
            // if(i+nums[i]==nums.length-1) return true;
            // if(nums[i]<ans){
            //     ans--;
            // }
            // else{
            //     ans=nums[i];
            // }
            ans = Math.max(ans - 1, nums[i]);
            if(ans==0) return false;
        }
        return true;
    }
}