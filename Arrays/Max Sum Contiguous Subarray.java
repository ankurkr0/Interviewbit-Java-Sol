public class Solution {
    public int maxSubArray(final List<Integer> A) {
        int currMax = A.get(0);
        int tempMax = A.get(0);
        
        for(int i=1;i<A.size();i++){
            tempMax = Math.max(tempMax + A.get(i), A.get(i));
            currMax = Math.max(tempMax,currMax);
        }
        return currMax;
    }
}
