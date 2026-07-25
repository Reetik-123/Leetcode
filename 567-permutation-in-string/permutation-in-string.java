class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int k = s1.length();
        int[] need = new int[26];
        int[] curr = new int[26];
        for (int i = 0; i < k; i++) {
            char ch = s1.charAt(i);
            char th = s2.charAt(i);
            need[ch - 'a']++;
            curr[th - 'a']++;
        }
        for (int i = k; i < s2.length(); i++) {
            if(comp(need,curr)){
                return true;
            }
            curr[s2.charAt(i-k)-'a']--;
            curr[s2.charAt(i)-'a']++;
        }
        return comp(need, curr);
    }
    public static boolean comp(int[] need,int[] curr){
        for(int i=0;i<26;i++){
            if(need[i]!=curr[i]){
                return false;
            }
        }
        return true;
    }
}