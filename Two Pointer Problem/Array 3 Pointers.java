public class Solution {
    public int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
        int i = 0;
        int j = 0;
        int k = 0;
        
        int ans = Integer.MAX_VALUE;
        
        while (i<A.size() && j<B.size() && k<C.size()) {
            int min = Math.min(A.get(i), Math.min(B.get(j), C.get(k)));
            int max = Math.max(A.get(i), Math.max(B.get(j), C.get(k)));
            int current = Math.abs(max - min);
            
            if (current < ans ) {
                ans = current;
            }
            
            if (min == A.get(i)) {
                i++;
            }
            else if(min == B.get(j)) {
                j++;
            }
            else k++;
        }
        
        return ans;
    }
}
