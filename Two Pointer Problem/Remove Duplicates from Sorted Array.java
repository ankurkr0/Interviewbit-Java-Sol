public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        int i = 0;
        int j = 0;
        int n = a.size();
    while (j < n) {
      int num = a.get(j);
      while (j < n && a.get(j) == num) {
        j++;
      }
      a.set(i++, num);
    }
    return i;
    }
}
