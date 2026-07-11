class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return countSubarray(nums,goal)-countSubarray(nums,goal-1);
    }
    public int countSubarray(int[] arr,int goal)
    {
        if(goal<0)
        {
            return 0;
        }
        int i=0;
        int j=0;
        int count=0;
        int sum=0;
        while(j<arr.length)
        {
            
            sum=sum+arr[j];
            
            while(sum>goal)
            {
                sum=sum-arr[i];
                i++;
            }
            if(sum<=goal)
            {
                count=count+(j-i+1);
            }
            j++;

        }
        return count;

    }
}