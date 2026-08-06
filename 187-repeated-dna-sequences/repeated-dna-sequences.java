class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        HashSet<String> seen = new HashSet<>();
        HashSet<String> ans = new HashSet<>();
        if (s.length()<10){
            return list;
        }
        for(int i=0;i<=s.length()-10;i++){
            String sub = s.substring(i,i+10);
            if(seen.add(sub)){
                continue;
            }else{
                if(ans.add(sub)){
                    list.add(sub);
                }
            }
        }
        return list;
        
        
    }
}