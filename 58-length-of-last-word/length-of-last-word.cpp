class Solution {
public:
    int lengthOfLastWord(string s) {
        int cnt=0;
        if(s.size()==1){
            return s[0] == ' ' ? 0 : 1;
        }
        for(int i=s.size()-1;i>=0;i--){
            if(s[i]==' ') continue;
            
            for(int j=i;j>=0;j--){
                if(s[j]==' ') return cnt;
                cnt+=1;
            }
            return cnt;
        }
        return cnt;
    }
};