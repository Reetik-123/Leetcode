class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        // vector<string> copy=strs;
        // vector<string> same;
        // for(int i=0;i<copy.size();i++){
        //     sort(copy[i].begin(),copy[i].end());
        //     copy[i].push_back(same);
        // }
        // vector<string> copy=strs;
        // vector<string> same;
        // for(int i=0;i<copy.size();i++){
        //     sort(copy[i].begin(),copy[i].end());
        //     same.push_back(copy[i]);
        // }


        // vector<vector<string>> ans;

        // for(int i = 0 ; i < same.size() ; i++){

        //     if(same[i] == "-1"){
        //         continue;
        //     }
        //     vector<string> result ; 
        //     result.push_back(strs[i]);
        //     for(int j = i+1 ; j < same.size() ;j++){
        //         if(same[i] == same[j]){
        //             // cout << "here " << strs[j] << " ";
        //             result.push_back(strs[j]);
        //             same[j] = "-1";
        //         }
        //     }
        //         // cout << endl;

        //     ans.push_back(result);


        // }

        //     return ans;


        unordered_map<string,vector<string>> mpp;

        for(int i = 0 ; i < strs.size() ;i++){

            // string s = sort(strs[i].begin() , strs[i].end());

            string s = strs[i];
            sort(strs[i].begin() , strs[i].end());
            
            if(mpp.find(strs[i]) == mpp.end()){
                mpp[strs[i]].push_back(s);
            }else{
                mpp[strs[i]].push_back(s);
            }
        }

        vector<vector<string>> result ;

        for(const auto& pair : mpp) {
            result.push_back(pair.second); 
        }

        return result ;
    }
        

    
};