public class Solution {
    public int searchInsert(ArrayList<Integer> a, int b) {
        int low = 0;
        int high = a.size()-1;
        if(b < a.get(low)) return 0;
        if(b > a.get(high)) return a.size();
        
        while(low<=high){
            int mid = low + (high -low)/2;
            if(a.get(mid)== b){
                return mid;
            }else if(a.get(mid)>b){
                high = mid -1;
            }else low = mid +1;
        }
        return low;
    }
}
