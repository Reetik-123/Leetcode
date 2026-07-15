class Solution {
    public int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        if(pivot==-1) return searched(nums,target,0,nums.length-1);
        if(target>=nums[0]){
            return searched(nums,target,0,pivot);
        }else{
            return searched(nums,target,pivot+1,nums.length-1);
        }
    }
    public int searched(int[] nums,int target,int i,int j){
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]<target){
                i=mid+1;
            }else if(nums[mid]>target){
                j=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public int findPivot(int[] nums){
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(mid<j && nums[mid]>nums[mid+1]){
                return mid;
            }else if(mid>i && nums[mid]<nums[mid-1]){
                return mid-1;
            }else{
                if(nums[mid]>nums[i]){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }
        }
        return -1;
    }
}