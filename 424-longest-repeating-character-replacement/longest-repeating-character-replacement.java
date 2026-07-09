class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxLen=Integer.MIN_VALUE;
        int changes=0;
        int max=Integer.MIN_VALUE;
            HashMap<Character,Integer> map=new HashMap<>();
         int i=0; 
            for(int j=0;j<s.length();j++)
            {
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                max=Math.max(max,map.get(s.charAt(j)));
                changes=(j-i+1)-max;
                if(changes<=k)
                {
                    maxLen=Math.max(maxLen,j-i+1);
                }
                else
                {
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i))==0)
                    {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }

            }
        
        return maxLen;
    }
}