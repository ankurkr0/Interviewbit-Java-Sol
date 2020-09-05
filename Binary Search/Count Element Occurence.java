public class Solution {
    public int findCount(final List<Integer> a, int b) {
         int first=binarySearch(a,b,true);
        if(first==-1)
            return 0;
        else{
         int last =binarySearch(a,b,false);
            return last-first+1;
        }
    }
    public int binarySearch(List<Integer> a, int b, Boolean first)
    {
        int low=0,high=a.size()-1,value =-1;
      
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a.get(mid)==b)
            {
                value=mid;
                if(first)
                    high=mid-1;     
                else
                    low=mid+1;
            }
            else if(a.get(mid)>b)
                high=mid-1;
            else
                low=mid+1;
        }
        return value;
    }
}
