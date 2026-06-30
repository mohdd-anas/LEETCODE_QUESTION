class Solution {
    public void setZeroes(int[][] arr) {
        int[] col=new int[arr[0].length];
        int[] row=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int x=0;x<row.length;x++)
        {
            if(row[x]==1)
            {
                for(int l=0;l<arr[0].length;l++)
                {
                    arr[x][l]=0;
                }
            }
        }

        for(int g=0;g<col.length;g++)
        {
            if(col[g]==1)
            {
                for(int h=0;h<arr.length;h++)
                {
                    arr[h][g]=0;
                }
            }
        }
        
    }
}