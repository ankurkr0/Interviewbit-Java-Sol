public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        int first = binarySearch(A,B,true);
        if(first == -1){
            res.add(-1);
            res.add(-1);
            return res;
        }else {
            int last = binarySearch(A,B,false);
            res.add(first);
            res.add(last);
            return res;
        }
    }
    public int binarySearch(List<Integer> A, int B, boolean flag){
        int low = 0;
        int high = A.size()-1;
        int result = -1;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(A.get(mid)== B){
                result = mid;
                if(flag){
                    high = mid-1;
                }else {
                    low = mid +1;
                }
            }
            else if (A.get(mid)<B) low = mid +1;
            else high = mid -1;
        }
        return result;
    }
}
