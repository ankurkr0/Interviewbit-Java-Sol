public class Solution {
    
// Use BigInteger if interviewer says its a really large value.
    public int compareVersion(String A, String B) {
        int x = A.length();
        int y = B.length();
        long temp1 = 0, temp2 = 0;
        int i =0, j=0;
        while(i<x || j<y){
            temp1=0;
            temp2=0;
            while(i<x && A.charAt(i)!='.'){
                temp1 = temp1*10 + A.charAt(i++) -'0';
            }
            while(j<y && B.charAt(j) !='.'){
                temp2 = temp2*10 + B.charAt(j++) -'0';
            }
            if(temp1 > temp2) return 1;
            else if (temp2>temp1) return -1;
            else{
                i++;
                j++;
            }
        }
        return 0;
    }
}
