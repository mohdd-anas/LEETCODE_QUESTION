class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int a = countSubArray(nums, goal);
        int b = countSubArray(nums, goal - 1);
        return a - b;
    }

    public int countSubArray(int[] arr, int goal) {
       int i=0;
       int j=0;
       int sum=0;
       int count=0;
       while(j<arr.length)
       {
        if(goal<0) return 0;
        sum=sum+arr[j];
        while(sum>goal)
        {
            sum=sum-arr[i];
            i++;
        }
        count=count+(j-i+1);
        j++;
       }
       return count;
    }
}