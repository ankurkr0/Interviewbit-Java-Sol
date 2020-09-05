public class Solution {
    public int paint(int k, int t, ArrayList<Integer> c) {
    int sum = 0;
    int n = c.size();
    for(int i =0; i< n;i++){
        sum +=c.get(i);
    }
     int start = 0;
     int end = sum;
     int result = -1;
     
     while(start <= end){
        int mid = start + (end - start)/2;
        if(isValue(c,k,mid,n)){
            result = mid;
            end = mid - 1;
        }  else 
        start = mid +1;
     }
     return (int)(((long)result*t)%10000003);
    }
     public boolean isValue(ArrayList<Integer> c, int k, int mid, int n){
         int painter = 1;
         int sum = 0;
         for(int i = 0; i<n; i++){
             sum += c.get(i);
             if(sum > mid){
                 painter++;
                 sum = c.get(i);
             }
             if(painter>k || sum > mid) return false;
         }
          return true;
     }
}
