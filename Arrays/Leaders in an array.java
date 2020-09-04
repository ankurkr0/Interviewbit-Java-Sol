public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<>();

        int x = A.get(A.size() - 1);
        B.add(x);

        for (int i = A.size() - 2; i > -1; i--) {
            int y = A.get(i);
            if (y > x) {
                B.add(y);
                x = y;
            }
        }
        return B;
    }
}
