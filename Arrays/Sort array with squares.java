public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        int k; 
        for (k = 0; k < n; k++) { 
            if (A.get(k) >= 0) 
                break; 
        } 
        
        int j=k;
        int i =k-1;
        
        ArrayList<Integer> ans = new ArrayList<>();
        while (i >=0 && j < A.size()) {
            if (A.get(i)*A.get(i) < A.get(j)*A.get(j)) {
                ans.add(A.get(i)*A.get(i));
                i--;
            } else {
                ans.add( A.get(j)*A.get(j));
                j++;
            }
        }
        while (i>=0) {
            ans.add(A.get(i)*A.get(i));
            i--;
        }
        while(j< A.size()) {
            ans.add(A.get(j)*A.get(j));
            j++;
        }
        return ans;
    }
}
