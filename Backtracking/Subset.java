public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Collections.sort(A);
        addSubset(A, list, new ArrayList<>(), 0);
        return list;
      }
    
      private void addSubset(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> curr, int pos) {
        list.add(new ArrayList<>(curr));
        for (int i = pos; i < A.size(); i++) {
          curr.add(A.get(i));
          addSubset(A, list, curr, i + 1);
          curr.remove(curr.size() - 1);
        }
      }

}
