class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int j=0;j<nums.length;j++)
        {
            sum=sum+nums[j];
            int remain=sum-goal;
            if(map.containsKey(remain))
            {
                count=count+map.get(remain);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);        }
        return count;
    }
}