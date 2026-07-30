class Solution {
    public int characterReplacement(String s, int k) {
       
        int maxf=-1;
        int i=0;
        int j=0;
        int ans=0;
        
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<s.length())
        {
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            maxf=Math.max(map.get(s.charAt(j)),maxf);
            
           
           while((j-i+1)-maxf>k)
            {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                i++;
            }
            ans=Math.max(j-i+1,ans);
            j++;
        }
        return ans;
    }
}