class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 1, right = 1;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=left;
            left*=nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i]*=right;
            right*=nums[i];
        }
        return ans;

        // int left = 1, right = 1;
        // int[] ans = new int[nums.length];
        // int[] lef = new int[nums.length];
        // int[] ri = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     lef[i] = left;
        //     left *= nums[i];
        // }
        // for (int i = nums.length - 1; i >= 0; i--) {
        //     ri[i] = right;
        //     right *= nums[i];
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     ans[i] = lef[i] * ri[i];
        // }
        // return ans;
    }
}