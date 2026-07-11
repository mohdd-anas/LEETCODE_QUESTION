class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int sum=0;
        int remain=0;
        int count=0;
        map.put(0,1);
        while(i<nums.length)
        {
            sum=sum+nums[i];
            remain=sum-k;
            if(map.containsKey(remain))
            {
                count=count+map.get(remain);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            i++;

        }
        return count;
    }
}