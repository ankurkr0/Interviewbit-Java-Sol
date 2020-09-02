// Method 1:
public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        if(A==null || A.size()==0) return A;
        Collections.sort(A);
        for(int i = 0; i < A.size()-1; i+=2){
            int temp = A.get(i);
            A.set(i, A.get(i+1));
            A.set(i+1, temp);
        }
        return A;
    }
    
}


// Method 2:
public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> a) {
         ArrayList<Integer> result = new ArrayList<Integer>();
         
        if(a==null || a.size()==0) return result;
        Collections.sort(a); int n = a.size();
        
        for(int i =0;i<n;i+=2){
            int j = i+1; 
            if(j<n){
                result.add(a.get(j));
                result.add(a.get(i));
            }
            else
             result.add(a.get(i));
        }
        return result;
    }
}
