class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
         long cur=0;
         long max=0;
        int l=0;
        for(int r=0;r<nums.length;r++)
        {
            while(set.contains(nums[r]) || set.size()==k)
            {
                set.remove(nums[l]);
                cur=cur-nums[l];
                l++;
            }
            cur=cur+nums[r];
            set.add(nums[r]);
             if(set.size()==k)
        {
            max=Math.max(cur,max);
        }
        }
        
       
        return max;
    }
}