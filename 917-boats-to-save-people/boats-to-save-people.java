class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int cnt=0;
        while(i<=j){
            int sum=nums[i]+nums[j];
            if(sum<=limit){
                cnt++;
                i++;
                j--;
            }else if(sum>limit){
                j--;
                cnt++;
            }
        }
        return cnt;
    }
}