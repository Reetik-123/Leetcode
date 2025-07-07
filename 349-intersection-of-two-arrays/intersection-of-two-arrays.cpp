class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> seen;
        if(nums2.size()<nums1.size()){
            swap(nums1,nums2);
        }
        for(int i=0;i<nums1.size();i++){
            for(int j=0;j<nums2.size();j++){
                if(nums1[i]==nums2[j] && seen.find(nums1[i]) == seen.end()){
                        seen.insert(nums1[i]);
                }
                else continue;
            }
        }
        vector<int> myVector(seen.begin(), seen.end());
        return myVector;
    }
};