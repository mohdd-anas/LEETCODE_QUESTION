class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowel=new ArrayList<>();
        char[] arr=s.toCharArray();
        String a="aeiouAEIOU";
        for(int i=0;i<s.length();i++)
        {
            if(a.indexOf(s.charAt(i))!=-1)
            {
                vowel.add(s.charAt(i));
                //original=original+"1";
            
            }
        }
        Collections.sort(vowel);
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(a.indexOf(arr[i])!=-1)
            {
                arr[i]=vowel.get(k);
                k++;
            }
        }
    
        return new String(arr);

    }
}