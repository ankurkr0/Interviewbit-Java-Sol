public class Solution {
    public int largestRectangleArea(ArrayList<Integer> A) {
        if (A == null || A.size() == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int ans = 0;
        for (int i = 0; i <= A.size(); i++) {
            int cur = (i == A.size()) ? -1 : A.get(i);
            while (!stack.isEmpty() && A.get(stack.peek()) >= cur) {
                int h = A.get(stack.pop());
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                ans = Math.max(ans, h * w);
            } 
            stack.push(i);
        }
        return ans;
    }
}
