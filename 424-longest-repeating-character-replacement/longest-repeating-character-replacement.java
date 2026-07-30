class Solution {
    public int characterReplacement(String s, int k) {
        Integer max=0;
        int maxL=-1;
        int i=0;
        int j=0;
        int cur=-1;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<s.length())
        {
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            max=Math.max(map.get(s.charAt(j)),max);
            cur=j-i+1;
           
           if((cur-max)>k)
            {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                i++;
                cur=j-i+1;
            }
            maxL=Math.max(cur,maxL);
            j++;
        }
        return maxL;
    }
}