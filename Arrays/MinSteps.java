public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        int dis = 0;
        int i = 1;
        
        while(i < A.size()){
            
            dis += Math.max(Math.abs(A.get(i)-A.get(i-1)), Math.abs(B.get(i)- B.get(i-1)));
            i++;
        }
        return dis;
    }
}
