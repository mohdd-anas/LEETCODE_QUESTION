class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        String ans="";
        int n=Math.min(first.length(),last.length());
        for(int i=0;i<n;i++)
        {
            if(first.charAt(i)!=last.charAt(i))
            {
                break;
            }
            ans=ans+first.charAt(i);
        }
        return ans;
    }
}