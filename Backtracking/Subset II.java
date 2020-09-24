public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
         ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Collections.sort(A);
        addSubset(A, list, new ArrayList<>(), 0);
        return list;
      }
    
      private void addSubset(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> curr, int start) {
        list.add(new ArrayList<>(curr));
        for (int i = start; i < A.size(); i++) {
             if (i > start && A.get(i).equals(A.get(i - 1))) continue;
      
          curr.add(A.get(i));
          addSubset(A, list, curr, i + 1);
          curr.remove(curr.size() - 1);
        }
    }
}
