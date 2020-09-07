public class Solution {
    public int isPalindrome(String A) {
        if(A.length()== 0) return 1;
        int i=0;int j=A.length()-1;
        while(i<j){
            if(!Character.isLetterOrDigit(A.charAt(i)))
            {i++;
            continue;
            }
            if(!Character.isLetterOrDigit(A.charAt(j)))
            {j--;
            continue;
            }
            if(Character.toLowerCase(A.charAt(i))!=Character.toLowerCase(A.charAt(j)))
            return 0;
        }
        return 1;
    }
}
