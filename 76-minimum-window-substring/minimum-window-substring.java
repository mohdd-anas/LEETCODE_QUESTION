class Solution {
    public String minWindow(String s, String t) {
        int count=t.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int index=0;index<t.length();index++)
        {
            map.put(t.charAt(index),map.getOrDefault(t.charAt(index),0)+1);
        }
        int i=0;
        int j=0;
        int startIndex=-1;
        int minLen=Integer.MAX_VALUE;
       
        while(j<s.length())
        {
            if(map.getOrDefault(s.charAt(j),0)>0)
            {
                count--;
                
            }
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)-1);
            while(count==0)
            {
               int curLen=j-i+1;
               if(curLen<minLen)
               {
                startIndex=i;
                minLen=curLen;
               }
              
               map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
               if(map.get(s.charAt(i))>0)
               {
                count++;
               }
               i++;

            }
            j++;

        }
        if(startIndex==-1)
        {
            return "";
        }
        return s.substring(startIndex,startIndex+minLen);
    }
}