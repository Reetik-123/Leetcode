class Solution {
public:
    int missingNumber(vector<int>& nums) {
        sort(nums.begin(),nums.end());

        int si=0;
        int ei=nums.size()-1;
        int mid;
        int ans;
        while(si <= ei){
            mid = si +(ei-si)/2;
            if(nums[mid]==mid){
                ans = mid;
                si = mid+1;
            }
            else{
                if(si == ei && nums[mid]!= mid){
                    return mid;
                }
                ei = mid;
            }
        }
        return ans+1;
    }
};