public class Solution {
    public void solveSudoku(ArrayList<ArrayList<Character>> a) {
         doSolve(a, 0, 0);
    }
    
    private boolean doSolve(ArrayList<ArrayList<Character>> a, int row, int col) {
        for (int i = row; i < 9; i++, col = 0) { // note: must reset col here!
            for (int j = col; j < 9; j++) {
                if ( a.get(i).get(j) != '.') continue;
                
                for (char num = '1'; num <= '9'; num++) {
                    if (isValid(a, i, j, num)) {
                        a.get(i).set(j, num);
                        if (doSolve(a, i, j + 1))
                            return true;
                       a.get(i).set(j, '.');
                    }
                }
                return false;
            }
        }
        return true;
    }
    
    private boolean isValid(ArrayList<ArrayList<Character>> a, int row, int col, char num) {
        int blockrow = (row / 3) * 3, blockcol = (col / 3) * 3;
        for (int i = 0; i < 9; i++)
            if (a.get(i).get(col) == num || a.get(row).get(i) == num || 
                   a.get(blockrow + i / 3).get(blockcol + i % 3) == num)
                return false;
        return true;
    }
}
