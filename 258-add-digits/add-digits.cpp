class Solution {
public:
    int loo(int a){
        int sum=0;
        for(int i=a;i>0;i=i/10){
            sum=sum+i%10;
        }
        return sum;
    
    }
    int addDigits(int num) {
        

        int c = loo(num);
        while (c>=10){
            c =loo(c);
        }
        return c;
        // if(c>10){
        //     return loo(c);
        // }
        // else{
        //     return c;
        // }
    }
};