public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        
// Method 1:
        if (A.size() == 0)
            return "";
            
        if (A.size() == 1)
            return A.get(0);
        
        int min = Integer.MAX_VALUE;    
        for (String str : A) {
            if ((str == null) || (str.length() == 0))
                return "";
            if (str.length() < min)
                min = str.length();
        }
                
        int indx = -1;
        boolean check = true;
        while (check) {
            indx++;
            if (indx == min)
                break;
            char c = A.get(0).charAt(indx);
            for (int i=1; i < A.size(); i++) {
                if (A.get(i).charAt(indx) != c) {
                    check = false;
                    break;
                }
            }
        }
        
        return A.get(0).substring(0, indx);

//Method 2:
        if (A.size() == 0)
            return "";
            
        if (A.size() == 1)
            return A.get(0);
        
        String prefix = A.get(0);
        
        for(int i = 1; i < A.size(); i++){
            while(A.get(i).indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
