public class Solution {
    
    public int maximumGap(final List<Integer> A) {
        int maxdiff,i,j;
        int n = A.size();
        
        int Rmax[] = new int[n];
        int Lmin[] = new int[n];
        
        Lmin[0] = A.get(0);
        for(i =1; i<n; i++){
            Lmin[i] = Math.min(A.get(i), Lmin[i-1]);
        }
        
        Rmax[n-1] = A.get(n-1);
        for(j = n-2; j>=0; j--){
            Rmax[j] = Math.max(A.get(j), Rmax[j+1]);
        }
        i=0; j=0; maxdiff=0;
        while(i < n && j < n){
            if(Lmin[i] < Rmax[i]){
                maxdiff = Math.max(maxdiff, j -i);
                j++;
            }else{
                i++;
            }
        }
        return maxdiff;
    }
}
