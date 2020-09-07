public class Solution {
    // We can also solve this in O(n) time complexity an O(m) space complexity using KMP algorithm
    public int strStr(final String A, final String B) {
        int n = A.length();
        int m = B.length();
        
        if(n==0 || m==0 || m>n) return -1;
        if(A.equals(B)) return 0;
        
        for(int i =0; i<n;i++){
            if(A.charAt(i) == B.charAt(0)){
                if(m +i<=n && A.substring(i,m+i).equals(B)) return i;
            }
        }
        return -1;
        
    }
}
