public class Solution {
    public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
        int zeroCount = 0; 
        int i = 0, j =0;
        int right =0, left = 0;
        while(j<A.size()) {
            
            if(zeroCount <= B){
             if(A.get(j).equals(0)) { 
                zeroCount++;
             }
                j++;
            }
            if(zeroCount > B) {  
                if(A.get(i).equals(0)) {
                    zeroCount--;
                }
                i++;
            }
            if((j-i) > (right-left)){
                left = i;
                right = j;
            } 
        }
         ArrayList<Integer> result = new ArrayList<Integer>();
        for (int k = left; k < right; k++){
            result.add(k);
        }
        return result;
        
     }
}
