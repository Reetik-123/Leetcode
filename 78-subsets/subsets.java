class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        backtrack(0,nums,res,ans);

        return res;
    }
    static void backtrack(int idx,int[] arr,List<List<Integer>> res,List<Integer> ans){
        if(idx==arr.length){
            res.add(new ArrayList<>(ans));
            return ;
        }
        ans.add(arr[idx]);
        backtrack(idx+1,arr,res,ans);

        ans.remove(ans.size()-1);
        backtrack(idx+1,arr,res,ans);
    }
}