class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        int i=0;
        while(i<strs.length)
        {
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(map.containsKey(key))
            {
                map.get(key).add(strs[i]);
            }
            else
            {
           List<String> list = new ArrayList<>();
           list.add(strs[i]);
            map.put(key, list);
            }
            i++;
        }
        List<List<String>> ans=new ArrayList<>();
        for(String name:map.keySet())
        {
            ans.add(new ArrayList<>(map.get(name)));
        }
        return ans;
    }
}