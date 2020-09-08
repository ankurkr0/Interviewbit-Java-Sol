public class Solution {
    public String solve(String s) {
           String[] tmp = s.split(" ");
    StringBuilder sb = new StringBuilder();
    
    for(int i = tmp.length - 1; i >= 0; i--){
        if(tmp[i].equals("")){
            continue;
        }
        
        sb.append(tmp[i]);
        sb.append(" ");
    }
    
    return sb.toString().trim();
    }
}
