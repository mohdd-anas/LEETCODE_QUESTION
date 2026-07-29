class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
       
        int max=-1;
        int count=0;
        while(j<nums.length)
        {
            //cur=(j-i)+1;
            if(nums[j]==0)
            {
                count++;
            }
            while(count>k)
            {
                if(nums[i]==0)
                {
                    count--;  
                }
                i++;
               
            }
            max=Math.max(max,j-i+1);
            j++;
        }
       
        return max;
        
    }
}