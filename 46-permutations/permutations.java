class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int[] check = new int[nums.length];
        sub(nums,ans,res,check);
        return res;
    }
    private static void sub(int[] arr,List<Integer> ans,List<List<Integer>> res,int[] check){
        if(ans.size()==arr.length){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(check[i]==1) continue;

            check[i]=1;
            ans.add(arr[i]);

            sub(arr,ans,res,check);

            ans.remove(ans.size()-1);
            check[i]=0;
        }
    }
}