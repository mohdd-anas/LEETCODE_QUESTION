class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int l = 0;
        int r = arr[0].length - 1;
        int b = arr.length - 1;
        int t = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (l <= r && t <= b) {
            for (int i = l; i <= r; i++) {
                list.add(arr[t][i]);
            }
            t++;
            for (int j = t; j <= b; j++) {
                list.add(arr[j][r]);
            }
            r--;
             if (t <= b) {
            for (int k = r; k >= l; k--) 
            {
                list.add(arr[b][k]);
            }
            b--;
             }
        
        if (l <= r)
        {
            for (int z = b; z >= t; z--) {
                list.add(arr[z][l]);
            }
            l++;
        }
             
        
        

    }
    return list;
    }
}
