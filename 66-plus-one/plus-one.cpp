class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int N= digits.size()-1;
        if(digits[N]<=8){
            digits[N]=digits[N]+1;
        }
        else{
            for(int i=N;i>=0;i--){
                if(digits[i]==9){
                    digits[i]=0;
                }
                else if(digits[i]!=9){
                    digits[i]+=1;
                    return digits;
                }
            }
            digits.insert(digits.begin(),1);
        }
        
        return digits;
        // long long int a=digits[0];
        // for(int i=1;i<digits.size();i++){
        //     a=a*10+digits[i];
        // }
        // a=a+1;
        // vector<int> ans;
        // while(a>0){
        //     int j=a%10;
        //     ans.push_back(j);
        //     a=a/10;
        // }
        // reverse(ans.begin(),ans.end());
        // return ans;
    }
    
};