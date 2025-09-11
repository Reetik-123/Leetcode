class Solution {
public:
    vector<int> transformArray(vector<int>& nums) {
        // for(int i=0;i<nums.size();i++){
        //     if(nums[i]%2==0){
        //         nums[i]=0;
        //     }
        //     else nums[i]=1;
        // }
        // sort(nums.begin(),nums.end());
        // return nums;
        int x=0,y=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]%2==0){
                x+=1;
            }
            else y+=1;
        }
        for(int i=0;i<x;i++){
            nums[i]=0;
        }
        for(int i=x;i<nums.size();i++){
            nums[i]=1;
        }
        return nums;


    }
};