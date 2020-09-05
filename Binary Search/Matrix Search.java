// Method 1:
public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
         if(a == null || a.size() == 0 || a.get(0).size() == 0) {
            return 0;
        }
        
        int n = a.size();
        int m = a.get(0).size();
        int i = 0;
        int j = m-1;
        while(i>=0 && i <n && j>=0 && j <m){
            if(a.get(i).get(j)==b) return 1;
            else if(a.get(i).get(j)>b){
                j--;
            }else i++;
        }
        return 0;
    }
}
// Method 2:
public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        int r = a.size();
        int c = a.get(0).size();
        int start = 0;
        int mid, x, y;
        int end = r * c - 1;
        while(start <= end) {
            mid = (start + end)/2;
            x = mid/c;
            y = mid % c;
            if(a.get(x).get(y) == b) {
                return 1;
            } else if(a.get(x).get(y) > b) {
                end = mid - 1;
               
            } else {
                start=mid + 1;
            }
        }
        return 0;
    }
}
