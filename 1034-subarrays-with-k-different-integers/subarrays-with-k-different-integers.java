class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return goodArray(nums,k)-goodArray(nums,k-1);
        
    }
    public int goodArray(int[] arr,int k)
    {
        if(k<0)
        {
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int count=0;
        while(j<arr.length)
        {
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
           
            while(map.size()>k)
            {
                map.put(arr[i],map.get(arr[i])-1);
                if(map.get(arr[i])==0)
                {
                    map.remove(arr[i]);
                }
                i++;
                
            }
             if(map.size()<=k)
            {
                count=count+(j-i+1);
            }
            j++;
        }
        return count;
    }
}
