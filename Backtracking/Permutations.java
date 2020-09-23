public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        helper(A, list, new ArrayList<Integer>());
        return list;
      }
    
      private void helper(ArrayList<Integer> A,  ArrayList<ArrayList<Integer>> list, ArrayList<Integer> temp) {
        if (temp.size() == A.size()) {
          list.add(new ArrayList<>(temp));
        }
        else {
          for (int i = 0; i < A.size(); i++) {
            if (!temp.contains(A.get(i))) {
              temp.add(A.get(i));
              helper(A, list, temp);
              temp.remove(temp.size() - 1);
            }
          }
        }
    }
}
