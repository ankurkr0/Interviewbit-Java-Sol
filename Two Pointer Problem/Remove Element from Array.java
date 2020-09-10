public class Solution {
    public int removeElement(ArrayList<Integer> a, int b) {
        int j=0;
        int n = a.size();
        for(int i=0;i<n;i++){

            if(!a.get(i).equals(b)){
                a.set(j, a.get(i));
                j++;
            }
        }
        return j;
    }
}
