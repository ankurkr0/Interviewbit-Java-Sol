public class Solution {
    public int Mod(int A, int B, int C) {
        if(A==0){
            return 0;
        }
        if(B==0){
            return 1;
        }
      
        if(A<0){
            return Mod(A+C, B, C);
        }
        long ans;
        long temp= Mod(A, B/2,C);
        if(B%2==0){
           ans =((temp%C)*(temp%C))%C;
        }else{
            ans= ((((A%C)*(temp%C))%C)*(temp%C))%C;
        }
        
        return (int)ans;
    }
}
