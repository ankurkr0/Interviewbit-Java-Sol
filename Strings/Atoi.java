public class Solution {
    
    public int atoi(final String A) {
        if( A==null || A.isEmpty()) return 0;
        int n = A.length();
        int i =0, sign = 1;
        while(i < n && A.charAt(i)==' '){
            i++;
        }
        if(i>=n) return 0;
        if(A.charAt(i) == '+' || A.charAt(i) == '-'){
            sign = A.charAt(i++)== '+' ? 1: -1;
        }
        long res =0;
        while(i <n && Character.isDigit(A.charAt(i))){
            res = res*10 + A.charAt(i++) - '0';
            if(res * sign > Integer.MAX_VALUE || res *sign < Integer.MIN_VALUE){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        return (int) (res*sign);
    }
}
