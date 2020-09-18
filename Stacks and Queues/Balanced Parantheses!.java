public class Solution {
    public int solve(String A) {
        Stack<Character> st = new Stack<>();
        for (char c : A.toCharArray()) {
            if(c=='('){
                st.push('(');
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    return 0;
                }
            }
        }
        if(st.isEmpty()){
            return 1;
        }else
            return 0;
    }
}
