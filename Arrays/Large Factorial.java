public class Solution {
    public String solve(int A) {
    
        BigInteger bi = BigInteger.valueOf(A);
        if(A>=2)
        for(int i=A-1;i>=1;i--)
        {
            bi=bi.multiply(BigInteger.valueOf(i));
        }
        String ans = null;
        ans = ""+bi;
         return ans;
    }
}
