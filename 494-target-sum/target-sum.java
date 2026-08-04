class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total=total+nums[i];
        }
        if (Math.abs(target) > total)
            return 0;

        if ((total + target) % 2 != 0)
            return 0;

        int compute = (total + target) / 2;
        if(target>compute)
        {
            return 0;
        }
        if((total+target)%2!=0)
        {
            return 0;
        }
        int[][] dp=new int[nums.length+1][compute+1];
        dp[0][0]=1;
        for(int j=1;j<=compute;j++)
        {
            dp[0][j]=0;
        }
        for(int i=1;i<nums.length+1;i++)
        {
            for(int j=0;j<compute+1;j++)
            {
                if(nums[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i-1]];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[nums.length][compute];
    }
}