class Solution {
public:
    int search(vector<int>& nums, int target) {
        int si=0;
        int ei=nums.size()-1;
        while(si <= ei){
            if(nums[si]==target){
                return si;
            }
            else if(nums[ei]==target){
                return ei;
            }
            si++,ei--;
        }
        return -1;
    }
};