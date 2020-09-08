public class Solution {
    public String intToRoman(int A) {

// Method 1:
          int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    
    StringBuilder sb = new StringBuilder();
    
    for(int i=0;i<values.length;i++) {
        while(A >= values[i]) {
            A -= values[i];
            sb.append(strs[i]);
        }
    }
    return sb.toString();
    
// Method 2:
    String M[] = {"", "M", "MM", "MMM"};
    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    return M[A/1000] + C[(A%1000)/100] + X[(A%100)/10] + I[A%10];

    }
}
