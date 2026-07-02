class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        HashSet<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                HashSet<Long> store=new HashSet<>();
                for(int k=j+1;k<arr.length;k++)
                {
                   long sum=(long)arr[i]+arr[j]+arr[k];
                   long need=(long)target-sum;
                    if(store.contains(need))
                    {
                        List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k],(int)need);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                    store.add((long)arr[k]);
                }
            }
        }
        return new ArrayList<>(ans);
    }
}