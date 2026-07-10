class Solution {
    public long countGood(int[] nums, int k) {
        int i=0;
        int j=0;
        int pair=0;
        long count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<nums.length)
        {
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            pair=pair+map.get(nums[j])-1;
            while(pair>=k)
            {
                count=count+(nums.length-j);
                pair=pair-(map.get(nums[i])-1);
                map.put(nums[i],map.get(nums[i])-1);
                
                i++;
            }
            j++;
        }
        return count;
    }
}