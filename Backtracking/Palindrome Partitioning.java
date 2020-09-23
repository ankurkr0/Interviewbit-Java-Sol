public class Solution {
    public ArrayList<ArrayList<String>> partition(String a) {
        ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
        getResults(res, new ArrayList<String>(), a);
        return res;
    }
    
    private void getResults(ArrayList<ArrayList<String>> res, ArrayList<String> list, String a) {
        if(a.length() == 0) {
            res.add(new ArrayList<String>(list));            
            return;
        }
        int n = a.length();
        for(int i = 0; i < n; i++) {
            if(checkPalindrome(a, 0, i)) {
                list.add(a.substring(0, i+1));
                getResults(res, list, a.substring(i+1));
                list.remove(list.size()-1);
            }
        }
    }
    private boolean checkPalindrome(String a, int i, int j) {
        while(i < j) {
            if(a.charAt(i) !=a.charAt(j)) return false;
            i++; 
            j--;
        }
        return true;
    }
}
