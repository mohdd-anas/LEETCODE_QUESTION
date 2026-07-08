class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int len=0;
        int max=0;
        for(int j=0;j<s.length();j++)
        {
            if(map.containsKey(s.charAt(j)))
            {
                i=Math.max(i,map.get(s.charAt(j))+1);
            }
            len=j-i+1;
            max=Math.max(len,max);
            map.put(s.charAt(j),j);
        }
        return max;
        
    }
}