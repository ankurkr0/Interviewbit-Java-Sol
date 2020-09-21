public class Solution {
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        int n = A.size();
        ArrayList<Integer> result = new ArrayList<>();
        if (n == 0) {
            return result ;
        }
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peek() < i - B + 1) {
                dq.poll();
            }
            while (!dq.isEmpty() && A.get(i) >= A.get(dq.peekLast())) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i - B + 1 >= 0) {
                result.add(A.get(dq.peekFirst()));
            }
        }
        return result;
    }
}
