public class Solution {
    public String solve(String A, int B) {
        
// Method 1:
      String result = "";
        if (A.length() == 0) return "";
        
        char ch = A.charAt(0);
        int count = 1;
        
        for (int i = 1; i < A.length(); i++) {
            if (ch == A.charAt(i)) {
                count++;
            } else {
                if (count != B) {
                    for (int j = 0; j < count; j++) {
                        result += "" + ch;
                    }
                }
                ch = A.charAt(i);
                count = 1;
            }
        }
        if (count != B) {
            for (int j = 0; j < count; j++) {
                result += "" + ch;
            }
        }
        return result;
  
//  Method 2:      
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = A.length();
        while (i < n) {
          char c = A.charAt(i);
          int start = i;
          int count = 0;
          while (i < n && A.charAt(i) == c) {
            i++;
            count++;
          }
          if (count != B) {
            sb.append(A.substring(start, i));
          }
    }
    return sb.toString();
    }
}
