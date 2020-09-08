public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        
// Method 1:
        if(A == null || A.length() == 0) return 0;
        int end = A.length() - 1;
        while(end >= 0 && A.charAt(end) == ' ') end--;
        if(end == -1) return 0;
        int len = 0;
        while(end >= 0 && A.charAt(end) != ' ') {
            end--;
            len++;
        }
        return len;
// Method 2: Can use when String is not Final
          A = A.trim();
        char[] array = A.toCharArray();
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == ' ')
                break;
            else count++;
        }
        return count;
    }
}
