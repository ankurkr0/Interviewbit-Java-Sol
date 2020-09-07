public class Solution {
    public int solve(String A) {
        int ans=0;

        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='A' || A.charAt(i)=='E' || A.charAt(i)=='I' || A.charAt(i)=='O' || A.charAt(i)=='U' || A.charAt(i)=='u' || A.charAt(i)=='o' || A.charAt(i)=='i' || A.charAt(i)=='e' || A.charAt(i)=='a'  )
            ans=ans+((A.length())-i);
        }
        return ans%10003;
    }
}
