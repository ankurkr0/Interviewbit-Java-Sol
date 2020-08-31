public class Solution {
    public int solve(int A, ArrayList<Integer> B) {
       int sum = B.get(0);
        int arr_new[] = new int[A];
        
        for(int i = 1; i < A; i++) {
            arr_new[i] = sum;
            sum += B.get(i);
        }
        
        if(sum%3 != 0) {
            return 0;
        }
        
        int ans = 0, count = 0;
        int x = sum/3;
        int y = (2 * sum)/3;
        
        for(int i = 1; i <A; i++) {
            if(arr_new[i] == y) {
                ans += count;
            }
            if(arr_new[i] == x) {
                count++;
            } 
        }
        return ans
    }
}
