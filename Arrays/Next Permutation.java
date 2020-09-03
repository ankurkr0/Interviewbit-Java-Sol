public class Solution {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        if(A.size() == 1) return A;
        
         int k = A.size() - 2;
         while(k>=0 && A.get(k)> A.get(k+1)){
             --k;
         }
         if (k<0){
             reverse(A, 0, A.size()-1);
             return A;
         }
         for(int l = A.size()-1; l>k; l--){
             if (A.get(l) > A.get(k)){
                 int temp = A.get(k);
                 A.set(k,A.get(l));
                 A.set(l,temp);
                 break;
             }
         }
         reverse(A, k+1, A.size()-1);
         return A;
    }
    public void reverse(ArrayList<Integer> A, int start, int end){
        while(start<end){
            int temp = A.get(start);
            A.set(start++, A.get(end));
            A.set(end--,temp);
        }
    }
    
}
