class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        solve("",s,ans);
        return ans;
    }
    public static List<String> solve(String output,String input,List<String> ans)
    {
        if(input.length()==0)
        {
            ans.add(output+input);
            return ans;
        }
        String op1=output+"";
        String op2=output+"";
        char ch=input.charAt(0);
        if(Character.isAlphabetic(input.charAt(0)))
        {
            if(ch>='a'&&ch<='z')
            {
                op1=op1+ch;
                op2=op2+Character.toUpperCase(ch);
            }
            if(ch>='A'&&ch<='Z')
            {
                op1=op1+ch;
                op2=op2+Character.toLowerCase(ch);
                
            }
        }
        else{
            solve(op1+ch,input.substring(1),ans);
            return ans;
        }
        input=input.substring(1);
        solve(op1,input,ans);
        solve(op2,input,ans);
        return ans;

    }
}