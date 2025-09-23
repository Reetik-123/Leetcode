class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        map<int,int> mpp;
        for(auto it : nums){
            mpp[it]++;
        }
        int maxfreq=0;
        int sum=0;
        for(auto it : mpp){
            if(it.second>maxfreq) maxfreq=it.second;
        }

        for(auto it : mpp){
            if(it.second==maxfreq) sum+=it.second;
        }
        return sum;
    }
};