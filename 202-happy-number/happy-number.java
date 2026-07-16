class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do
        {
            slow=square(slow);
            fast=square(square(fast));
            
                
            
            
        }while(slow!=fast);
        if(slow==1)
        {
            return true;
        }
        return false;
    }
    public static int square(int n)
    {
        int ans=0;
        while(n!=0)
        {
            ans=ans+(n%10)*(n%10);
            n=n/10;
        }
        return ans;
    }
}