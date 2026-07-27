class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        int[] lps=buildLPS(needle);
        int i=0,j=0;
        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
                if(j==needle.length()){
                return i-j;
                }
            }
            else{
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return -1;
    }
    public int[] buildLPS(String pattern){
        int[] lts = new int[pattern.length()];
        int len=0;
        int i=1;
        lts[0]=0;
        while(i<pattern.length()){
            char pre=pattern.charAt(i);
            char suf=pattern.charAt(len);
            if(pre==suf){
                len++;
                lts[i]=len;
                i++;
            }
            else if(len>0){
                len=lts[len-1];
            }
            else{
                lts[i]=0;
                i++;
            }
        }
        return lts;
    }
}