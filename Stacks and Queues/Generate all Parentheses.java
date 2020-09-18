public class Solution {
    public int isValid(String A) {
        Stack<Character> stack = new Stack<Character>();
	for (char c : A.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return 0;
	}
	return stack.isEmpty() ? 1 : 0;
    }
}
