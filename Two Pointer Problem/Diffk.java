public class Solution {
    public int diffPossible(ArrayList<Integer> A, int B) {
         int i = 0;
        int j = 1;
        int n = A.size();
        while (i < n && j < n) {
            if(i == j){
                j++;
                continue;
            }
            int diff = A.get(j) - A.get(i);
            if (diff == B) {
                return 1;
            }
            if (diff < B) {
                j++;
            }
            else {
                i++;
            }
        }
        return 0;
    }
}
