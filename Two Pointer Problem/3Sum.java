public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int minDiff = Integer.MAX_VALUE;
        int closestSum = 0;
        
        for(int i =0; i< A.size()-2;i++){
            int low= i+1;
            int high = A.size()-1;
            while(low<high){
                int sum = A.get(i)+A.get(low)+A.get(high);
                if(Math.abs(sum - B) == 0) return B;
                if(Math.abs(sum - B) < minDiff){
                    minDiff = Math.abs(sum - B);
                    closestSum = sum;
                }
                if(sum > B){
                    high--;
                }else low++;
                
            }
        }
        return closestSum;
       
    }
}
