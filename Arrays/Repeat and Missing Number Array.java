Method 1:
public class Solution {
  
    public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        int n = a.size();
        long sumOfNum = (((long)n)*((long)n +1))/2;
        long sumOfSq = (((long)n)*((long)n+1)*((long)(n*2+1)))/6;
        
       for(int i =0; i<n; i++){
           sumOfNum -= (long)a.get(i);
       }
        for(int i= 0; i<n; i++){
            sumOfSq -= (long)a.get(i)*(long)a.get(i);
        }
       long sumNum = sumOfSq/sumOfNum;
       
       int missing = (int)(sumNum+sumOfNum)/2;
       int repeated = (int)(sumNum-missing);
       res.add(repeated);
       res.add(missing);
        return res;
    }
}

Method 2:
// when a is not final.
public class Solution {
  
    public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        int n = a.size();
        
       for(int i =0; i<n; i++){
           if(a.get(i) != a.get(a.get(i)-1)){
           int temp = a.get(i);
           a.set(i,a.get(temp-1));
           a.set(temp-1,temp);
           }
       }
        for(int i= 0; i<n; i++){
            if(a.get(i)!= i+1){
            res.add(a.get(i));
            res.add(i+1);
            }
        }
       
        return res;
    }
}
