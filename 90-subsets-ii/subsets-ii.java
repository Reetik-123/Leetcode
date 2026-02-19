class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        subset(0,nums,ans,res);
        return res;
    }
    private static void subset(int idx,int[] arr,List<Integer> ans,List<List<Integer>> res){
        res.add(new ArrayList(ans));

        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;

            ans.add(arr[i]);
            subset(i+1,arr,ans,res);
            ans.remove(ans.size()-1);
        }
    }
}