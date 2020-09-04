//Method 1: Modified moore's voting algorithm

public class Solution {
    
    public int repeatedNumber(final List<Integer> a) {
         int n = a.size();
        
        if (n == 0) return -1;
        if (n == 1) return a.get(0);
        int check = n/3;
        
        int c1=a.get(0), c2=a.get(1), c1Count=0, c2Count=0;
        for (int num : a) {
            if (c1 == num) {
                c1Count++;
            }
            else if (c2 == num) {
                c2Count++;
            }
            else if (c1Count == 0) {
                c1 = num;
            }
            else if (c2Count == 0) {
                c2 = num;
            }
            else {
                c1Count--;
                c2Count--;
            }
        }
        
        c1Count = 0;
        c2Count = 0;
        
        for(int num : a) {
            if (num == c1) {
                c1Count++;
            }
            else if (num == c2) {
                c2Count++;
            }
        }
        
        if (c1Count > check) {
            return c1;
        }
        else if (c2Count > check) {
            return c2;
        }
        else {
            return -1;
        }
    }
}

//Method 2:
public class Solution {
    public int repeatedNumber(final List<Integer> a) {
        int n = a.size();
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++){
            int x = a.get(i), times = 0;
            if(h.containsKey(x)){
                times = h.get(x);
                h.put(x, times + 1);
                times++;
                
            }else{
                h.put(x, 1);
                times = 1;
            }
            if(times > n / 3){
                    return x;
            }
        }
        return -1;
    }
}
