public class Solution {
    public int nTriang(ArrayList<Integer> A) {
        int n = A.size();
        int res = 0;
        if (n < 3) return res;
        Collections.sort(A);
        
        for(int i=0;i<A.size()-2;i++){

            int k = i+2;
            for(int j=i+1;j<A.size();j++){

                while(k<A.size() && A.get(i) + A.get(j) > A.get(k)){
                    k++;
                }
                res = (res + (k-j-1)%1000000007)%1000000007;
            }
        }
        return res;
    }
}
