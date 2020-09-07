public class Solution {
    public int solve(String A) {
        int left =0;
        int right = A.length()-1;
        
        while(left<=right){
            if(A.charAt(left) != A.charAt(right)){
                if(helper(A,left+1,right) || helper(A, left, right -1)) return 1;
                return 0;
            }
            left++;
            right--;
        }
        return 1;
    }
    boolean helper(String A,int i ,int j){
        int left = i;
        int right = j;
        while(left<=right){
            if(A.charAt(left) != A.charAt(right)) return false;
            else {
            left++;
            right--;
            }
        }
        return true;
    }
}
