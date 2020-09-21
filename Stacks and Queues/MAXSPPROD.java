public class Solution {
    public int maxSpecialProduct(ArrayList<Integer> A) {
        if (A.size() <= 2) {
          return 0;
        }
        Stack<Integer> stack = new Stack<>();
        long[] prods = new long[A.size()];
        stack.push(0);
        for (int i = 1; i< A.size(); i++) {
          while (!stack.isEmpty() && A.get(stack.peek()) <= A.get(i)) {
            stack.pop();
          }
          if (!stack.isEmpty()) {
            prods[i] = stack.peek() % 1000000007;
          }
          stack.push(i);
        }
       Stack<Integer> st = new Stack<>();
        st.push(A.size() - 1);
        for (int i = A.size() - 1; i >= 0; i--) {
          while (!st.isEmpty() && A.get(st.peek()) <= A.get(i)) {
            st.pop();
          }
          if (!st.isEmpty()) {
            prods[i] *= (st.peek() % 1000000007);
          }
          else {
            prods[i] = 0;
          }
          st.push(i);
        }
        long maxVal = 0;
        for (int i = 0; i < A.size(); i++) {
          if (prods[i] > maxVal) {
            maxVal = prods[i];
          }
        }
    return (int) (maxVal % 1000000007);
    }
}
