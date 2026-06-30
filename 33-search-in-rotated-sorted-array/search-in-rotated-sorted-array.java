class Solution {
    public int search(int[] arr, int target) {
        int index=pivot(arr);
        if(binarysearch(0,index,arr,target)==-1)
        {
            return binarysearch(index,arr.length,arr,target);
        }
        return binarysearch(0,index,arr,target);


    }
    public static int binarysearch(int start,int end,int [] arr,int target)
    {
        int i=start;
        int j=end-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr[mid]==target)
            {
                return mid;

            }
            if(arr[mid]>target)
            {
                j=mid-1;
            }
            else
            {
                i=mid+1;
            }
            
        }
        return -1;

    }
    public static int pivot(int [] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int mid=i+(j-i)/2;
            if(arr[mid]>arr[j])
            {
                
                i=mid+1;
            }
            else
            {
                j=mid;
            }
        }
        return j;
    }
}