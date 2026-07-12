class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] clone=arr.clone();
        Arrays.sort(clone);
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int i=0;i<clone.length;i++)
        {
            if(!map.containsKey(clone[i]))
            {
                map.put(clone[i],rank++);
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            arr[j]=map.get(arr[j]);
        }
        return arr;
    }

}