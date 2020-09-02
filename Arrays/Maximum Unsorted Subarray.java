public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
         ArrayList<Integer> result = new ArrayList<Integer>();
         boolean flag = false;
         
         for(int i=1; i< A.size(); i++){
             if(A.get(i) < A.get(i-1))
             flag = true;
             if(flag)
             min = Math.min(min, A.get(i));
         }
        flag = false;
        
         for(int i = A.size()- 2; i>=0; i--){
            if(A.get(i) > A.get(i+1))
            flag = true;
            if(flag)
            max = Math.max(max, A.get(i));
            
        }
        int l,r;
        for(l = 0; l< A.size(); l++){
            if(min < A.get(l))
            break;
        }
        for(r = A.size()- 1; r>=0; r--){
            if(max > A.get(r))
            break;
        }
        if (r-l <0){
        result.add(-1);
        return result;
        }
        result.add(l);
        result.add(r);
        return result;
    }
}
