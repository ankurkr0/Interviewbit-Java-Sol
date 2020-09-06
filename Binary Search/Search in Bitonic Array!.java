public class Solution {
   //Method 1:
    public int solve(ArrayList<Integer> A, int B) {
        int size = A.size();
        int left = 0;
        int right = size - 1;
        
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(A.get(mid) == B)
                return mid;
            else if(A.get(left) <= A.get(mid)) {
                if(A.get(mid) > B)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else if(B < A.get(mid))
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
        
    }
    
  //Method 2:
    public int solve(ArrayList<Integer> A, int B) {
    int bp = findBp(A);
    if (A.get(bp) == B) {
      return bp;
    }
    int value = ascendingBS(A, B, 0, bp - 1);
    return value != -1 ? value : descendingBS(A, B, bp + 1, A.size() - 1);
  }

  private int ascendingBS(ArrayList<Integer> A, int key, int start, int end) {
    while (start <= end) {
      int mid = end + (start - end) / 2;
      if (A.get(mid) == key) {
        return mid;
      }
      else if (A.get(mid) > key) {
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
    }
    return -1;
  }

  private int descendingBS(ArrayList<Integer> A, int key, int start, int end) {
    while (start <= end) {
      int mid = end + (start - end) / 2;
      if (A.get(mid) == key) {
        return mid;
      }
      else if (A.get(mid) < key) {
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
    }
    return -1;
  }

  private int findBp(ArrayList<Integer> A) {
    int start = 0;
    int end = A.size() - 1;
    while (start <= end) {
      int mid = end + (start - end) / 2;
      if(mid >0 && mid < A.size()-1){
      if (A.get(mid) > A.get(mid + 1) && A.get(mid) > A.get(mid - 1)) {
        return mid;
      }
      if (A.get(mid) < A.get(mid - 1)) {
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
      }
    }
    return -1;
  }
    
}
