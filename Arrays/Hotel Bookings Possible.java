public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        
        int i = 0;
        int j = 0;
        
        while(i < arrive.size() && j < depart.size()){
            if(arrive.get(i) < depart.get(j)){
                i++;
                K--;
            } else if (arrive.get(i) == depart.get(j)){
                i++;
                j++;
            }else {
                j++;
                K++;
            }
            if(K<0)
            return false;
        }
       return true; 
        
    }
}
