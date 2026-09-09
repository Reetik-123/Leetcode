class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length;
        while(i<j){
            int mid = i +(j-i)/2;
            // if(nums[mid]==target){
            //     return mid;
            // }
            // else if(nums[mid]<target){
            //     i=mid+1;
            // }else{
            //     j=mid-1;
            // }
            if(nums[mid]>=target){
                j=mid;
            }else{
                i=mid+1;
            }
        }
        return i;
    }
}