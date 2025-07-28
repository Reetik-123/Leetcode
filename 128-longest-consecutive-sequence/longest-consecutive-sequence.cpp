class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.empty()) return 0;
        set<int> st(nums.begin(), nums.end());
        vector<int> v;
        for(auto it : st){
            v.push_back(it);
        }
        int maxi = 1;
        int n = v.size();
        int cnt = 1;
        for(int i=1; i<n; i++){
            if(v[i]-v[i-1]==1){
                cnt++;
                maxi = max(maxi, cnt);
            }
            else cnt = 1;
        }
        return maxi;
    }
};