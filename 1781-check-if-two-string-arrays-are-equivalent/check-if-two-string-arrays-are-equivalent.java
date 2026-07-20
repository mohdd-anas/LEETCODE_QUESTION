class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       // String[] word1=new String[n];
        int i;
        // for(i=0;i<word1.length;i++)
        // {
        //     word1[i]=sc.next();
        // }
        //int m=sc.nextInt();
       // String[] word2=new String[m];
        
        // for(i=0;i<word2.length;i++)
        // {
        //     word2[i]=sc.next();
        // }
        
        String ans1="";
        String ans2="";
        for(i=0;i<word1.length;i++)
        {
            ans1=ans1+word1[i];
        }
        
        for(i=0;i<word2.length;i++)
        {
            ans2=ans2+word2[i];
        }
        if(ans1.equals(ans2))
        {
            return true;
        }
        
        return false;
        
    }
}