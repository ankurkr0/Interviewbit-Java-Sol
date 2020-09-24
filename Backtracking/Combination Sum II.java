public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
         Collections.sort(a);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        backTrack(a, ans, new ArrayList<>(), b, 0);
        return new ArrayList<>(ans);
      }
    
      private void backTrack(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp, int b, int pos) {
        if (b == 0) {
          ans.add(new ArrayList<>(temp));
        }
        else if (b < 0 || pos == a.size()) {
          return;
        }
        else {
          for (int i = pos; i < a.size(); i++) {
            if (i > pos && a.get(i).equals(a.get(i - 1))) {
              continue;
            }
            temp.add(a.get(i));
            backTrack(a, ans, temp, b - a.get(i), i + 1);
            temp.remove(temp.size() - 1);
          }
        }
    }
}
