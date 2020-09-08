import java.math.BigInteger;
public class Solution {
    public int power(String A) {
        
// Method 1:
        if (A.equals("1")) return 0;
        BigInteger b1 = new BigInteger(A);
        return b1.bitCount() == 1 ? 1 : 0;
        
// Method 2:
        if (A.length() <= 0) return 0;
        if (A.equals("1")) return 0;
        BigInteger b = new BigInteger(A);
        BigInteger b2 = new BigInteger("2");
        BigInteger b1 = new BigInteger("1");
        while ((b.remainder(b2)).intValue()== 0)
        b = b.divide(b2);
        if(b.equals(b1)) 
        return 1;
        return 0;
    }
    
}
