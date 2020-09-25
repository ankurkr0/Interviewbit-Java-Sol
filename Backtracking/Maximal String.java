public class Solution {
    public String solve(String A, int B) {
        char[] C = A.toCharArray();
        generate(C,B);
        return String.valueOf(max);
    }
    
    int max=0;
    
    public void generate(char[] C, int B){
        if(B==0){
            return;
        }
        
        for (int i = 0; i < C.length - 1; i++){
            for (int j = i + 1; j < C.length; j++) {
                if(C[j]>C[i]){
                    swap(C,j,i);
                    
                    int temp = Integer.parseInt(String.valueOf(C));
                    max=Math.max(max,temp);
                    generate(C,B-1);
                    swap(C,j,i);
                }    
            }
        } 
    }
    public void swap(char[] C, int i, int j){
        char temp=C[i];
        C[i]=C[j];
        C[j]=temp;
    }
        
}
