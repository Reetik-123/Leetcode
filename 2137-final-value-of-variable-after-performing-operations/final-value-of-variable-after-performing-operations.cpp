class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int x=0;
        string a="--X",b="X--",c="++X",d="X++";
        for(int i=0;i<operations.size();i++){
            if(operations[i]==a || operations[i]==b) x-=1;
            else if(operations[i]==c || operations[i]==d) x+=1; 
        }
        return x;
    }
};