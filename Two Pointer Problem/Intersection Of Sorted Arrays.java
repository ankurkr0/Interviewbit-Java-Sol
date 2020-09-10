public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i<A.size() || j<B.size()){
            int x = i<A.size() ? A.get(i) : Integer.MAX_VALUE;
            int y = j<B.size() ? B.get(j) : Integer.MAX_VALUE;

            if(x < y){
                i++;
            }
            else if(y < x){
                j++;
            }
            else{
                res.add(x);
                i++;
                j++;
            }
        }

        return res;
    }
}
