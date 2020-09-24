public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Collections.sort(A);
        backTrack(A, ans, new ArrayList<>(), B, 0);
        return new ArrayList<>(ans);
      }
    
      private void backTrack(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp, int b, int pos) {
        if (b < 0) {
          return;
        }
        if (b == 0) {
          if(!ans.contains(temp)) {
            ans.add(new ArrayList<>(temp));
          }
          return;
        }
        for (int i = pos; i < a.size(); i++) {
          temp.add(a.get(i));
          backTrack(a, ans, temp, b - a.get(i), i);
          temp.remove(temp.size() - 1);
        }
    }
}
