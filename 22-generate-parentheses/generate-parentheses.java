class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(0,0,n,"",res);
        return res;

    }
    public void generate(int open,int close,int n,String ans,List<String> res){
        if(ans.length()==n*2){
            res.add(ans);
            return;
        }
        if(open!=n){
            generate(open+1,close,n,ans+"(",res);
        }
        if(open>close){
            generate(open,close+1,n,ans+")",res);
        }
    }
}