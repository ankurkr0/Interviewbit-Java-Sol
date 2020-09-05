public class Solution {
    public int books(ArrayList<Integer> A, int B) {
        if(B> A.size()) return -1;
         int sum = 0;
         int n = A.size();
         for(int i =0; i<n; i++){
             sum += A.get(i);
         }
         int start = 0;
         int end = sum;
         int result = -1;
         while(start<=end){
             int mid = start + (end-start)/2;
             if(isValue(A,B,n,mid)){
                 result = mid;
                 end = mid -1;
             }else start = mid +1;
         }
         return result;
    }
    public boolean isValue(ArrayList<Integer> A, int B, int n, int mid){
        int student = 1;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += A.get(i);
            if(sum > mid){
                student++;
                sum = A.get(i);
            }
            if(sum>mid || student >B){
                return false;
            }
        }
        return true;
    }
}
