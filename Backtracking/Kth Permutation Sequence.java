public class Solution {
    public String getPermutation(int A, int B) {
        
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= A; i++) 
        list.add(i);
        int factorial = 1;
        for (int i = 2; i <= A; i++) 
        factorial *= i; 
        
        StringBuilder strBuilder = new StringBuilder();
        for (B--; A > 0; A--) {
            factorial /= A;
            strBuilder.append(list.remove(B / factorial));
            B %= factorial;
        }
        
        return strBuilder.toString();
    }
}
