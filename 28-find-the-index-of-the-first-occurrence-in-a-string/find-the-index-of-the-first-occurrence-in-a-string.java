class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int k=needle.length();
        if(n<k) return -1;
        for(int i=0;i<=n-k;i++){
            int temp=1;
            for(int j=i;j<k+i;j++){
                if(haystack.charAt(j)!=needle.charAt(j-i)){
                    temp=0;
                    break;
                }
            }
            if(temp==1){
                return i;
            }
        }
        return -1;
    }
}