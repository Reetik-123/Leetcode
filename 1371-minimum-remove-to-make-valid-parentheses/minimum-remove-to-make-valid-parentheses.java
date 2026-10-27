class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(arr[i] == '('){
                st.push(i);
            }else if(arr[i]==')'){
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    arr[i]='#';
                }
            }
        }
        while(!st.isEmpty()){
            arr[st.pop()]='#';
        }
        for(int i =0;i<s.length();i++){
            if(arr[i]!='#'){
                sb.append(arr[i]);
            }
        }
        return sb.toString();
        
    }
}