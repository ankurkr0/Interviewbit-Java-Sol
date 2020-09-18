public class Solution {
    public int braces(String A) {
        Stack<Character> stack = new Stack<>();
        for (char c : A.toCharArray()) {
          if (c == ')') {
            char top = stack.pop();
            if (top == '(') {
              return 1;
            }
            else {
              boolean flag = true;
              while (top != '(') {
                  if (top == '+' || top == '-'|| top == '*' || top == '/') { 
                        flag = false; 
                    } 
                top = stack.pop();
              }
              if (flag == true) {
                return 1;
              }
            }
          }
          else {
            stack.add(c);
          }
        }
        return 0;
    }
}
