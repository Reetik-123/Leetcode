class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        int a=nums.size();
        vector<int> v;
        for(int i=0;i<2*a;i++){
            if(i>=a){
                v.push_back(nums[i-a]);
            }
            else{
            v.push_back(nums[i]);
            }
        }
        return v;
    }
};