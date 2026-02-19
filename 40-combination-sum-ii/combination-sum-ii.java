class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(candidates);
        comb(0,candidates,target,ans,res);
        return res;
    }
    private static void comb(int idx,int[] arr,int target,List<Integer> ans,List<List<Integer>> res){
            if(target==0){
                res.add(new ArrayList<>(ans));
                return;
            }

            for(int i=idx;i<arr.length;i++){
                if(i>idx && arr[i]==arr[i-1]) continue;
                if(arr[i]<=target){
                    ans.add(arr[i]);
                    comb(i+1,arr,target-arr[i],ans,res);
                    ans.remove(ans.size()-1);
                }

            }
    }
}