public class Solution {
// Use long long if number are big as sum will go out of range .
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = A.size();
        for(int i=0; i<n-2; i++){
            if(i==0 || (i>0 && A.get(i)!=A.get(i-1))){
                int low = i+1;
                int high = n-1;
                int sum = 0-A.get(i);
                
                while(low<high){
                    if(A.get(low) + A.get(high) == sum){
                         ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(A.get(i)); 
                    temp.add(A.get(low)); 
                    temp.add(A.get(high));
                    res.add(temp);
                    low++;
                    high--;
                        while(low <high && A.get(low) == A.get(low-1)) low++;
                        while(low<high && A.get(high) == A.get(high +1)) high --;
                       
                    }else if(A.get(low) + A.get(high) > sum) high --;
                    else low ++;
                }
            }
        }
        return res;
    }
}
