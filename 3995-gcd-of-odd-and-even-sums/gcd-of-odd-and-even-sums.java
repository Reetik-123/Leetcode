class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oSum=0,eSum=0;
        int i=1;
        while(i<n*2){
            if(i%2==0){
                eSum+=i;
            }else{
                oSum+=i;
            }
            i++;
        }
        return gcd(oSum,eSum);
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}