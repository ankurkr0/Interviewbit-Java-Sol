public class Solution {
    public int solve(ArrayList<Integer> A) {
         Collections.sort(A);
        int l =A.size();
        
        for(int i=0; i<l ;i++){
                if(i< l - 1 && A.get(i)==A.get(i+1)){
                continue;
                }
            if(A.size() - i - 1 == A.get(i))
            return 1;
        }
        return -1;
    }
}
