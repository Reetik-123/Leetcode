class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans = new Stack<>();

        for(char i : s.toCharArray()){
            if(i=='('|| i=='['|| i=='{'){
                ans.push(i);
            }
            else if(i==')'|| i==']'|| i=='}'){
                
                if (ans.isEmpty()) return false;
                else if((i==')' && ans.peek()!='(')
                        || (i==']' && ans.peek()!='[') 
                        || (i=='}' && ans.peek()!='{')){
                            return false;
                }
                ans.pop();
            }
        }
        return ans.isEmpty();    
    }
}
