class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> op=new ArrayList<>();
        return solve(op,nums);
        
    }
    public static List<List<Integer>> solve(ArrayList<Integer> op,int[] arr)
    {
        ArrayList op1=new ArrayList<>(op);
        ArrayList op2=new ArrayList<>(op);
        List<List<Integer>> ans=new ArrayList<>();
        if(arr.length==0)
        {
            ans.add(new ArrayList<>(op));
            return ans;
        }
        
        op2.add(arr[0]);
        arr=Arrays.copyOfRange(arr,1, arr.length);
        ans.addAll(solve(op1,arr));
        ans.addAll(solve(op2,arr));
        return ans;
    }
}