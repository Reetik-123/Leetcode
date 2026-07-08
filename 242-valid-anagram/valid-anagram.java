class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        // for(char x: s){
        //     map[x]++;
        // }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char th = t.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
            if(map.containsKey(th)){
                map.put(th,map.get(th)-1);
            }else{
                map.put(th,-1);
            }

        }
        for(char x : map.keySet()){
            if(map.get(x)!=0) return false;
        }
        return true;
    }
}