class Solution {
    public int[] twoSum(int[] arr, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
       map.put(arr[0],0);
       for(int i=1;i<arr.length;i++)
       {
        int remain=target-arr[i];
        if(map.containsKey(remain))
        {
            return new int[]{map.get(remain),i};
        }
        map.put(arr[i],i);
       }
       return new int[]{-1,-1};
    }
}