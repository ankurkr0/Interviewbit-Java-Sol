public class Solution {
    public int sqrt(int x) {
    if (x == 0 || x == 1) 
       return x;
    long start = 1, end = x;
    long ans = 0 ; 
    
    while (start <= end) 
    {        
        long  mid = (start + end) / 2;
        long check = mid*mid;
        if (check == x) return  (int)mid;
         if (check < x) 
        {
            start = mid + 1;
            ans = mid;
        } 
        else
            end = mid - 1;        
    }
    return (int)ans;
    }
}
