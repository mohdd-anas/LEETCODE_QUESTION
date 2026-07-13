class Solution {
    public int rob(int[] nums) {
        int ans[]=new int[nums.length];
        if(nums.length==1)
        {
            return nums[0];
        }
        ans[0]=nums[0];
        ans[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            int case1=ans[i-2]+nums[i];
            int case2=ans[i-1];
            ans[i]=Math.max(case1,case2);
        }
        return ans[nums.length-1];

    }
}