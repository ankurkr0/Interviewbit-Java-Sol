public class Solution {
    public int trap(final List<Integer> A) {
        
        int left = 0, right = A.size() - 1;
        int leftMax = 0, rightMax = 0;
        int res = 0;
        while (left < right) {
          if (A.get(left) < A.get(right)) {
            if (A.get(left) > leftMax) {
              leftMax = A.get(left);
            }
            else {
              res += leftMax - A.get(left);
            }
            left++;
          }
          else {
            if (A.get(right) > rightMax) {
              rightMax = A.get(right);
            }
            else {
              res += rightMax - A.get(right);
            }
            right--;
          }
        }
        return res;
    }
}
