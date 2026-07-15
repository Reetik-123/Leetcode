class Solution {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(mid<j && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else if(mid>i && nums[mid]<nums[mid-1]){
                return nums[mid];
            }else{
                if(nums[i]<nums[mid]){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }
        }
        return nums[0];
    }
    
}

















