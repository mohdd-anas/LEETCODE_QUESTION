class Solution {
    public int pivotIndex(int[] nums) {
        int[] s=new int[nums.length];
        int[] p=new int[nums.length];
        int n=nums.length;
        p[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            p[i]=p[i-1]+nums[i];
        }
        s[n-1]=nums[n-1];
        for(int j=n-2;j>=0;j--)
        {
            s[j]=s[j+1]+nums[j];
        }
        for(int z=0;z<nums.length;z++)
        {
            if(s[z]==p[z])
            {
                return z;
            }
        }
        return -1;
    }
}