public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
         int count = 0; 
         int j = 0; 
            int max_length = 0; 
            int n = A.size();
  
    for (int i = 0; i < n; i++) { 
        if (A.get(i) == 0) 
            count++; 
        while (count > B) { 
            if (A.get(j) == 0) 
                count--; 
            j++; 
        } 
  
        max_length = Math.max(max_length, i - j + 1); 
    } 
  
    return max_length;
    }
}
