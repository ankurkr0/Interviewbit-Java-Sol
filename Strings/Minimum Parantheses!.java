public class Solution {
    public int solve(String A) {
        
// Method 1:
        Stack<Character> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < A.length(); i++) {
          char ch = A.charAt(i);
          if (ch == ')') {
            if (stack.isEmpty()) {
              result++;
            } else {
              stack.pop();
            }
          } else {
            stack.push(ch);
          }
        }
        result += stack.size();
        return result;
        
// Method 2:
        int leftBracket =0, rightBracket = 0;
        for(int i=0; i<A.length();i++){
            if(A.charAt(i) == '('){
                rightBracket++;
            }else if(rightBracket>0){
                rightBracket--;
            }else leftBracket++;
        }
        return leftBracket + rightBracket;
    }
}
