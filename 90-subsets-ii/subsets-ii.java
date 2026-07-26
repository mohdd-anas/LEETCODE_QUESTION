class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> op=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        return solve(nums,op,ans,set);
    }
    public List<List<Integer>> solve(int[] arr,List<Integer> op,List<List<Integer>> ans,HashSet<List<Integer>> set )
    {

        if(arr.length==0)
        {
            if(!set.contains(op))
            {
            ans.add(new ArrayList<>(op));
            set.add(new ArrayList<>(op));
            }
            return ans ;
        }
        List<Integer> op1=new ArrayList<>(op);
        List<Integer> op2=new ArrayList<>(op);
        op2.add(arr[0]);
        arr=Arrays.copyOfRange(arr,1,arr.length);
        solve(arr,op1,ans,set);
        solve(arr,op2,ans,set);
        return ans;
    }
}