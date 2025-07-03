class Solution {
public:
    int countDigits(int num) {
        int a=num;
        int cnt=0;
        while(num>0){
            int j=num%10;
            if(a%j==0) cnt+=1;
            num=num/10;
        }
        return cnt;
    }
};