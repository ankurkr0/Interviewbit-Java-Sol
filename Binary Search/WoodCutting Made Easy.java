public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int minH = Integer.MAX_VALUE;
        int maxH = Integer.MIN_VALUE;
        int n = A.size();
        for(int i = 0; i<n; i++){
            minH = Math.min(minH,A.get(i));
            maxH = Math.max(maxH,A.get(i));
        }
        int left = minH;
        int right = maxH;
        int result = 0;
        while(left<=right){
            int mid = left +(right -left)/2;
            long length = tLength(A,mid,n);
            
            if(length >=B){
                result = mid;
                left = mid +1;
            }else right = mid -1;
        }
        return result;
    }
    public int tLength(ArrayList<Integer> A,int mid,int n){
        long sum = 0;
        for(int i = 0; i<n; i++){
            if (A.get(i)>mid){
            sum += A.get(i)-mid;
            }
        }
        return sum;
    }
    
}
