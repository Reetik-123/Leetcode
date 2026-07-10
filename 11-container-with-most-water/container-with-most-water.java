class Solution {
    public int maxArea(int[] nums) {
        int ans=0;
        int i=0,j=nums.length-1;
        while(i<j){
            int height=Math.min(nums[i],nums[j]);
            int width=j-i;
            ans=Math.max(ans,height*width);
            if(nums[i]<nums[j]) i++;
            else j--;
        }
        
        return ans;
    }
}