class Solution {
    public int jump(int[] nums) {
        int maxReach =0;
        int cnt=0;
        int curr=0;
        for(int i=0;i<nums.length-1;i++){
            maxReach=Math.max(maxReach,i+nums[i]);
            if(i==curr){
                cnt++;
                curr=maxReach;
            }
        }
        return cnt;
    }
}