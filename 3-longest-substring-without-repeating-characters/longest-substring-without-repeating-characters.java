class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0,right=0;
        HashSet<Character> set = new HashSet<>();
        int sub=0;
        int window=0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
                window--;
            }
            set.add(ch);
            window++;
            sub=Math.max(sub,window);
        }
        return sub;
    }
}