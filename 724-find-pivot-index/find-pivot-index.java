class Solution {
    public int pivotIndex(int[] nums) {
        int left=0,right=0,tot=0;
        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            right=tot-left-nums[i];
            if(left==right) return i;
            left+=nums[i];
            
        }
        return -1;
    }
}