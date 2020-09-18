public class Solution {
    public String simplifyPath(String A) {
        Stack<String> stack = new Stack();
        for(String cur: A.split("/")){
            if(cur.equals("..")) {
                if(!stack.empty()) stack.pop();
            }
            else if(cur.length()>0 && !cur.equals(".")) 
            stack.push(cur);
    }
    return "/"+String.join("/",stack);
    }
}
