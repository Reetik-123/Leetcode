class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] arr = { -1, -1 };
        int first = search(nums, target, true);
        int last = search(nums, target, false);
        arr[0] = first;
        arr[1] = last;
        return arr;
    }
    public int search(int[] nums,int target,boolean findLorF){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //ans found
                ans = mid;
                if(findLorF){
                    end=mid-1;
                }
                else start = mid+1;
            }
        }
        return ans;
    }


    // int[] arr = {-1,-1};
        // int start = 0;
        // int end=nums.length-1;

        // while(start<=end) {
        //     int mid = start + (end - start) / 2;

        //     if (target < nums[mid]) {
        //         end = mid - 1;
        //     } else if (target > nums[mid]) {
        //         start = mid + 1;
        //     } else {
        //         //ans found
        //         arr[0] = mid;
        //         end=mid-1;
        //     }
        // }

        // start = 0;
        // end=nums.length-1;
        // while(start<=end) {
        //     int mid = start + (end - start) / 2;

        //     if (target < nums[mid]) {
        //         end = mid - 1;
        //     } else if (target > nums[mid]) {
        //         start = mid + 1;
        //     } else {
        //         //ans found
        //         arr[1] = mid;
        //         start = mid +1;

        //     }
        // }
        // return arr;
}