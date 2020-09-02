class Solution {
    public List<Integer> spiralOrder(int[][] A) {
         List<Integer> res = new ArrayList<>();
         
        if(A.length == 0) return res;
        
        int rowBegin =0;
        int rowEnd = A.length-1;
        int columnBegin = 0;
        int columnEnd = A[0].length-1;
        
        while(rowBegin <= rowEnd && columnBegin <= columnEnd){
            for(int i = columnBegin; i<= columnEnd; i++){
                res.add(A[rowBegin][i]);
            }
            rowBegin++;
            for(int i = rowBegin; i<=rowEnd; i++){
                res.add(A[i][columnEnd]);
            }
            columnEnd--;
            if(rowBegin<=rowEnd){
            for(int i = columnEnd; i>=columnBegin; i--){
                res.add(A[rowEnd][i]);
            }
            }
            rowEnd--;
            if(columnBegin<=columnEnd){
            for(int i =rowEnd; i >= rowBegin; i--){
                res.add(A[i][columnBegin]);
            }
            }
            columnBegin++;
        }
        return res;
    }
}
