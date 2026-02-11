class Solution {
     public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        sub(0,candidates,ans,res,target);
        return res;
    }
    private void sub(int i,int[] arr,List<Integer> ans,List<List<Integer>> res,int k){
        if(i==arr.length){
            if(k==0){
            res.add(new ArrayList<>(ans));
            }
        return;
        }
        if(arr[i]<=k){
            ans.add(arr[i]);
        sub(i,arr,ans,res,k-arr[i]);
        ans.remove(ans.size()-1);
        }
        sub(i+1,arr,ans,res,k);
    }
}