class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String s= paragraph.toLowerCase().replaceAll("[^a-zA-Z]+"," ");
        String[] fin=s.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<banned.length;i++)
        {
            set.add(banned[i]);

        }
        for(int i=0;i<fin.length;i++)
        {
            if(set.contains(fin[i]))
            {
                continue;
            }
            map.put(fin[i],map.getOrDefault(fin[i],0)+1);
        }
        int max=0;
        String ans="";
        for(String key:map.keySet())
        {
            if(map.get(key)>max)
            {
                ans=key;
                max=map.get(key);
            }
        }
        return ans;
        
    }
}