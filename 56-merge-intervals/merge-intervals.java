class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int start=arr[i][0];
            int end=arr[i][1];

            if(!list.isEmpty() && end<=list.get(list.size()-1).get(1))
            {
                continue;
            }
            int j;
            for(j=i+1;j<arr.length;j++)
            {
                if(end>=arr[j][0])
                {
                    end=Math.max(arr[j][1],end);
                }
                else
                {
                    break;
                }

            }
            list.add(Arrays.asList(start,end));
            i=j-1;

        }
        
        int[][] ans = new int[list.size()][2];

for (int i = 0; i < list.size(); i++) {
    ans[i][0] = list.get(i).get(0);
    ans[i][1] = list.get(i).get(1);
}

return ans;
        
    }
}