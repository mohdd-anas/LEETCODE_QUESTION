class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] PSE=PSE(heights);
        int[] NSE=NSE(heights);
        int area=0;
        int max=0;
        int length=0;
        for(int i=0;i<heights.length;i++)
        {
            
            area=heights[i]*(NSE[i]-PSE[i]-1);
            max=Math.max(area,max);
        }
        return max;
    }
    public int[] PSE(int[] arr)
    {
        Stack<Integer> stack=new Stack<>();
        int[] PSE=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
         while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
        {
                stack.pop();
        }
        if(stack.isEmpty())
        {
             PSE[i]=-1;
        }
        else
        {
                PSE[i]=stack.peek();
        }
        stack.push(i);
         
        }
        return PSE;
    }
    public int[] NSE(int[] arr)
    {
        Stack<Integer> stack=new Stack<>();
        int[] NSE=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                NSE[i]=arr.length;
            }
            else
            {
                NSE[i]=stack.peek();
            }
            stack.push(i);
        }
        return NSE;
    }
}