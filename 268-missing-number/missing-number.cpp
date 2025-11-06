class Solution {

private:

    int ms2(vector<int>& arr){


        int ele = 0 ;
        int a = 0 ;


        for(int i = 0 ; i < arr.size() ;i++){
            a = a^arr[i];
            ele = ele ^ (i+1);
        }


        return a ^ ele ;

    }


public:
    int missingNumber(vector<int>& nums) {
        // sort(nums.begin(),nums.end());

        // int si=0;
        // int ei=nums.size()-1;
        // int mid;
        // int ans;
        // while(si <= ei){
        //     mid = si +(ei-si)/2;
        //     if(nums[mid]==mid){
        //         ans = mid;
        //         si = mid+1;
        //     }
        //     else{
        //         if(si == ei && nums[mid]!= mid){
        //             return mid;
        //         }
        //         ei = mid;
        //     }
        // }
        // return ans+1;

        return ms2(nums);
    }
};