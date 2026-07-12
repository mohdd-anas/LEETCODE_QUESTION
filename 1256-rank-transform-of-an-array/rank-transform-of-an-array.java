class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] clone=arr.clone();
        Arrays.sort(clone);
        if(Arrays.equals(clone,arr))
        {   boolean flag=true;
            for(int z=1;z<clone.length;z++)
            {
                if(clone[0]!=clone[z])
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
            int[] ans=new int[arr.length];
            Arrays.fill(ans,1);
            return ans;
            }

        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(clone[0],1);
        for(int i=1;i<clone.length;i++)
        {
            if(!map.containsKey(clone[i]))
            {
            map.put(clone[i],map.get(clone[i-1])+1);
            }
        }
        int[] ans=new int[arr.length];
        for(int j=0;j<arr.length;j++)
        {
            arr[j]=map.get(arr[j]);
        }
        return arr;
        
    }
}