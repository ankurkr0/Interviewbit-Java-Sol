public class Solution {
    public String multiply(String A, String B) {
        int n = A.length();
        int m = B.length();
        if(n==0 || m==0 || A.equals("0") || B.equals("0")) return "0";
        int[] ans = new int[n+m];
        
        
        for(int i=n-1; i>=0; --i){
            for(int j=m-1; j>=0; --j){
                int mul = (A.charAt(i)-'0') * (B.charAt(j)-'0');
                int sum = ans[i+j+1] + mul;
                ans[i+j] += sum/10;
                ans[i+j+1] = (sum)%10;
                
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Integer value : ans){
            if(!(sb.length()==0 && value ==0))
            sb.append(value);
        }
         return sb.toString();
    }
   
}
