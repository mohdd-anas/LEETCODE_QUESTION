class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int cur=nums[i];
            int next=nums[(i+1)%nums.length];
            if(cur>next)
            {
                count++;
            }
        }
        if(count>1)
        {
            return false;
        }
        return true;
        
    }
}