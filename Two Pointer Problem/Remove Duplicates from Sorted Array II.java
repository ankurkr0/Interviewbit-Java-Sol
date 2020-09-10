public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        int i = 0;
        int j = 0;
        int n = a.size();
    while (j < n) {
        int num = a.get(j);
        int count = 0;
      while (j < n && a.get(j) == num) {
        j++;
        count++;
      }
      for (int i = 0; i < Math.min(count, 2); i++) {
        a.set(i++, num);
      }
    }
    return i;
    }
}
