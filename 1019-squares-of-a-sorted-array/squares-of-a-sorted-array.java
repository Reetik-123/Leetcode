class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0,right=nums.length-1;
        int[] arr =new int[nums.length];
        int j=arr.length-1;
        while(left<=right){
            if(nums[left]*nums[left]<=nums[right]*nums[right]){
                arr[j]=nums[right]*nums[right];
                right--;
            }
            else if(nums[left]*nums[left]>nums[right]*nums[right]){
                arr[j]=nums[left]*nums[left];
                left++;
            }
            j--;
        }
        return arr;
    }
}