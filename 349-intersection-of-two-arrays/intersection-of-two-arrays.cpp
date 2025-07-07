class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> seen;
        vector<int> arr,arr1;
        if(nums1.size()<=nums2.size()){
            arr =nums1;
            arr1=nums2;
        }
        else{
            arr=nums2;
            arr1=nums1;
        }
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr1.size();j++){
                if(arr[i]==arr1[j] && seen.find(arr[i]) == seen.end()){
                        seen.insert(arr[i]);
                }
                else continue;
            }
        }
        vector<int> myVector(seen.begin(), seen.end());
        return myVector;
    }
};