class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] st = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char th = t.charAt(i);
            st[ch-'a']+=1;
            st[th-'a']-=1;
        }
        for(int i=0;i<st.length;i++){
            if(st[i]!=0) return false;
        }
        return true;
    }
}