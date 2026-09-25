class Solution {
    public boolean backspaceCompare(String s, String t) {
       return build(s).equals(build(t));
    }
    private Stack<Character> build(String str){
        Stack<Character> st = new Stack<>();
        for(char c: str.toCharArray()){
            if(c!='#'){
                st.push(c);
            }else if(!st.isEmpty()){
                st.pop();
            }
        }
        return st;
    }
}