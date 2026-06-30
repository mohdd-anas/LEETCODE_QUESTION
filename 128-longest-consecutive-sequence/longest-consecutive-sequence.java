class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        if(nums.length==0)
        {
            return 0;
        }
        int longest=1;
        int sequence=1;
        for(int i :nums)
        {
            set.add(i);
        }
        for(int j:set)
        {
            if(set.contains(j+1))
            {

                sequence++;
               // continue;
            }
            else
            {
                sequence=1;
            }
            longest=Math.max(sequence,longest);
        }
        return longest;
    }
}