public class Solution {

// Method 1:
    public ArrayList<String> restoreIpAddresses(String A) {
        ArrayList<String> res = new ArrayList<>();
        int n = A.length();
        for(int i =1; i<n && i < 4; i++){
            String first = A.substring(0,i);
            if(!isValid(first)) continue;
            for(int j= 1; i+j<n && j<4; ++j){
                String second = A.substring(i, i+j);
                if(!isValid(second)) continue;
                for(int k =1; i+j+k<n && k<4; k++){
                    String third = A.substring(i+j,i+j+k);
                    String fourth = A.substring(i+j+k);
                    if(!isValid(third) || !isValid(fourth)) continue;
                    res.add(first + '.' + second + '.' +third + '.' + fourth);
                }
            }
        }
        return res;
    }
    public boolean isValid(String s){
      if(s.length()>3 || s.length()==0 || (s.charAt(0)=='0' && s.length()>1) || Integer.parseInt(s)>255 || Integer.parseInt(s)<0)
            return false;
        return true;
    }
    
    
//  Method 2: Backtracking  
         ArrayList<String> result = new ArrayList<>();
        doRestore(result, "", A, 0);
        return result;
    }
    public void doRestore(List<String> result, String path, String s, int k) {
        if (s.isEmpty() || k == 4) {
            if (s.isEmpty() && k == 4)
                result.add(path.substring(1));
            return;
        }
        for (int i = 1; i <= (s.charAt(0) == '0' ? 1 : 3) && i <= s.length(); i++) { // Avoid leading 0
            String part = s.substring(0, i);
            if (Integer.valueOf(part) <= 255)
                doRestore(result, path + "." + part, s.substring(i), k + 1);
    }
    }
    
    
}
