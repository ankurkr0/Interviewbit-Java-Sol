public class Solution {
    public ArrayList<ArrayList<String>> solveNQueens(int a) {
        char[][] chess = new char[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                chess[i][j] = '.';
            }
        }
        ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();

        solve(res, chess, 0);
        return res;
    }
    private void solve(ArrayList<ArrayList<String>> res, char[][] chess, int row) {
        if (row == chess.length) {
            res.add(construct(chess));
            return;
        }
        for (int col = 0; col < chess.length; col++) {
            if (valid(chess, row, col)) {
                chess[row][col] = 'Q';
                solve(res, chess, row + 1);
                chess[row][col] = '.';
            }
        }
    }
    private boolean valid(char[][] chess, int row, int col) {
        int N = chess.length;
        for (int i = 0; i < row; i++) {
            if (chess[i][col] == 'Q') {
                return false;
            }
            int rowDiff = row - i;
            if (col + rowDiff < N && chess[i][col + rowDiff] == 'Q') {
                return false;
            }
            if (col - rowDiff >= 0 && chess[i][col - rowDiff] == 'Q') {
                return false;
            }
        }
        return true;
    }
    private ArrayList<String> construct(char[][] chess) {
        ArrayList<String> path = new ArrayList<>();
        for (int i = 0; i < chess.length; i++) {
            path.add(new String(chess[i]));
        }
        return path;
    }
}
