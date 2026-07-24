class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowel=new ArrayList<>();
        ArrayList<Character> original=new ArrayList<>();
        String a="aeiouAEIOU";
        for(int i=0;i<s.length();i++)
        {
            if(a.indexOf(s.charAt(i))!=-1)
            {
                vowel.add(s.charAt(i));
                original.add('1');
            
            }
            else
            {
                original.add(s.charAt(i));
            }
            
        }
        Collections.sort(vowel);
        int k=0;
        for(int i=0;i<original.size();i++)
        {
            if(original.get(i)=='1')
            {

                original.set(i,vowel.get(k));
                k++;
            }
        }
        String ans="";
        for(char z:original)
        {
            ans=ans+z;
        }
        return ans;

    }
}