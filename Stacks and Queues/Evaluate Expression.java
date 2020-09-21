public class Solution {
    public int evalRPN(ArrayList<String> A) {
        int a,b;
		Stack<Integer> st = new Stack<Integer>();
		for (String s : A) {
			if(s.equals("+")) {
				st.add(st.pop()+st.pop());
			}
			else if(s.equals("/")) {
				b = st.pop();
				a = st.pop();
				st.add(a / b);
			}
			else if(s.equals("*")) {
				st.add(st.pop() * st.pop());
			}
			else if(s.equals("-")) {
				b = st.pop();
				a = st.pop();
				st.add(a - b);
			}
			else {
				st.add(Integer.parseInt(s));
			}
		}	
		return st.pop();
    }
}
