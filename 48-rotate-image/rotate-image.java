class Solution {
    public void rotate(int[][] arr) {
        int[][] ans=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                ans[j][(arr.length-1)-i]=arr[i][j];

            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=ans[i][j];
            }
        }
    }
}