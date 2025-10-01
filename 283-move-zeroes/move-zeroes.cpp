class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int n = nums.size();

        int i=0;
        int j=0;
        for(int k=0; k<n; k++){
            if(nums[k] == 0) j++;
            else{
                swap(nums[j], nums[i]);
                i++;
                j++;
            }
        }
    }
};