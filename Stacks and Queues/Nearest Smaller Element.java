public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        if(A.size() == 0) return ans;
        Stack<Integer> st = new Stack<>();
        
        for(int val : A){
            while(!st.isEmpty() && st.peek() >= val){
                st.pop();
            }
            if(st.isEmpty()) ans.add(-1);
            else ans.add(st.peek());
            st.push(val);
        }
        return ans;
    }
}
