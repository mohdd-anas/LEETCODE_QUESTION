class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return check(s,0,s.length()-1);
    }
    public boolean check(String s,int st,int e)
    {
        if(st>=e)
        {
            return true;
        }
        if(s.charAt(st)==s.charAt(e))
        {
            return check(s,st+1,e-1);
        }
        else
        {
            return false;
        }
       
        
    }
}