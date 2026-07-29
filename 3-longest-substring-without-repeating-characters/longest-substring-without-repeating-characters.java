class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int max=Integer.MIN_VALUE;
        int cur=0;
        
        for(int j=0;j<s.length();j++)
        {
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            cur=(j-i)+1;
            while(map.getOrDefault(s.charAt(j),0)>1)
            {
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
                cur=j-i+1;
                
            }
            max=Math.max(cur,max);
            
        }
        if(max==Integer.MIN_VALUE)
        {
            return 0;
        }
        return max;
        
    }
}