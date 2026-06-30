class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0)
        {
            return 0;
        }
        Arrays.sort(arr);
        int lastsmall=Integer.MIN_VALUE;
        int longest=1;
        int sequence=0;
        for(int i=0;i<arr.length;i++)
        {
           
            if(lastsmall==arr[i]-1)
            {
                lastsmall=arr[i];
                sequence++;
            }
            else if(arr[i]!=lastsmall)
            {
                lastsmall=arr[i];
                sequence=1;
            }
            longest=Math.max(longest,sequence);
        }
        
        return longest;
    }
}