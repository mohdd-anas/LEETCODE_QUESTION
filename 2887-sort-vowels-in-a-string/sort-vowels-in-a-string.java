class Solution {
    public String sortVowels(String s) {
        char[] original=s.toCharArray();
        String vowel="aeiouAEIOU";
        List<Character> ch=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(vowel.indexOf(s.charAt(i))!=-1)
            {
                ch.add(s.charAt(i));
                original[i]='_';
            }
        }
        Collections.sort(ch);
        int l=0;
        for(int i=0;i<original.length;i++)
        {
            if(original[i]=='_')
            {
                original[i]=ch.get(l);
                l++;
            }
        }
        return new String(original);
    }
}