public class Solution {
    public int[][] generateMatrix(int A) {
        int[][] res = new int[A][A];
        int k =1;
        int rowBegin =0;
        int rowEnd = A-1;
        int columnBegin = 0;
        int columnEnd = A-1;
        
        while( k <= A*A){
            for(int i = columnBegin; i<= columnEnd; i++){
                res[rowBegin][i]=k;
                k++;
            }
            rowBegin++;
            for(int i = rowBegin; i<=rowEnd; i++){
                res[i][columnEnd]=k;
                k++;
            }
            columnEnd--;
            for(int i = columnEnd; i>=columnBegin; i--){
                res[rowEnd][i]=k;
                k++;
            }
            rowEnd--;
            for(int i =rowEnd; i >= rowBegin; i--){
                res[i][columnBegin]= k;
                k++;
            }
            columnBegin++;
        }
        return res;
    }
}
