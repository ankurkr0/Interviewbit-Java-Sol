public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        
// Methd 1:
        Set<Integer> set = new HashSet<>();
        for(int a : A) {
            if(set.contains(B + a) || set.contains(a - B)) return 1;
                set.add(a);
        }
        return 0;
        
// Method 2:
        if(A.size() <= 1) return 0;

    Collections.sort(A);
    int size = A.size() ;
        int i = 0, j = 1; 
        while (i < size && j < size) 
        { 
            if (i != j && A.get(j)-A.get(i) == B) 
                return 1; 
            else if (A.get(j)-A.get(i) < B) 
                j++; 
            else
                i++; 
        } 
        return 0; 
    }
}
