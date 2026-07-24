class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowel=new ArrayList<>();
        String original="";
        String a="aeiouAEIOU";
        for(int i=0;i<s.length();i++)
        {
            if(a.indexOf(s.charAt(i))!=-1)
            {
                vowel.add(s.charAt(i));
                original=original+"1";
            
            }
            else
            {
                original=original+s.charAt(i);
            }
            
        }
        Collections.sort(vowel);
        int k=0;
        String ans="";
        for(int i=0;i<original.length();i++)
        {
            if(original.charAt(i)=='1')
            {
                ans=ans+vowel.get(k);
                k++;
            }
            else
            {
                ans=ans+original.charAt(i);
            }
        }
    
        return ans;

    }
}