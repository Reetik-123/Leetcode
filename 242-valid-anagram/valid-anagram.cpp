class Solution {
public:
    bool isAnagram(string s, string t) {
        // sort(s.begin(),s.end());
        // sort(t.begin(),t.end());
        // if(s==t) return true;
        // else return false;
        unordered_map<char,int> hash;
        for(auto it : s){
            hash[it]++;
        }
        for(auto it : t){
            hash[it]--;
        }
        for(auto it: hash){
            if(it.second!=0) return false;
        }
        return true;
    }
};