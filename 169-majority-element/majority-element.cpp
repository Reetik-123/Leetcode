class Solution {
public:
    int majorityElement(vector<int>& nums) {
       unordered_map<int,int> hash;
       for(auto it : nums) hash[it]++;
       int max=0;
       int fs;
       for(auto it : hash){
            if(it.second>max){
                max=it.second;
                fs=it.first;
            }
       } 
       return fs;
    }
};