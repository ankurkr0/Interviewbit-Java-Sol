// We can also solve this by calculating the min element and applying BS on both the left and right side.
public class Solution {
    public int search(final List<Integer> a, int b) {
          int i=0;
        int j=a.size()-1;
        
        while(i<=j) {
            int mid = (i +j)/2;
            
            if(a.get(mid)==b)
                return mid;
            if(a.get(mid)>=a.get(i)) {
                if(b>=a.get(i)&&b<a.get(mid))
                    j=mid-1;
                else
                    i=mid+1;
            }
            else {
                if(b>a.get(mid)&&b<=a.get(j))
                    i=mid+1;
                else
                    j=mid-1;
            }
        }
        return -1;
    }
}
