class Solution {
public:
    static bool compare(pair<int,int>& a, pair<int,int>& b){
        if(a.second==b.second) return a.first>b.first;
        return a.second>b.second;
    }
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> mpp;
        for(auto it : nums){
            mpp[it]++;
        }
        vector<pair<int,int>> temp(mpp.begin(), mpp.end());
        sort(temp.begin(), temp.end(), compare);
        vector<int> ans;
        for(int i=0; i<k && i<temp.size(); i++){
            ans.push_back(temp[i].first);
        }
        return ans;
    }
};