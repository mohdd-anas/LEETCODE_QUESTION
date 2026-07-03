class Solution {
    public void reverseString(char[] s) {
        rev(s,0,s.length-1);
        
    }
    public void rev(char [] s,int st,int ed)
    {
        if(st>=ed)
        {
            return;
        }
        char temp=s[st];
        s[st]=s[ed];
        s[ed]=temp;
        st++;
        ed--;
        rev(s,st,ed);
    }
}