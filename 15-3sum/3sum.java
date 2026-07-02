class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        
        HashSet<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<arr.length;j++)
            {
                int sum=-(arr[i]+arr[j]);
                if(set.contains(sum))
                {
                    List<Integer> temp=Arrays.asList(arr[i],arr[j],sum);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                set.add(arr[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}