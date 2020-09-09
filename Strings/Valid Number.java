public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isNumber(final String A) {
        String sA = A.trim();
        boolean numSee = false;
        boolean dotSee = false;
        boolean eSee = false;
        for(int i =0; i < sA.length(); i++){
            char c = sA.charAt(i);
            if(Character.isDigit(c)){
                numSee = true;
            }
            else if(c == 'e'){
                if(eSee || !numSee) return 0;
                eSee = true;
                numSee = false;
            }
            else if (c =='.'){
                if(eSee || dotSee) return 0;
                dotSee = true;
                numSee = false;
            }
            else if(c =='-' || c=='+'){
                if(i != 0 && sA.charAt(i-1) != 'e') return 0;
            } 
            else return 0;
        }
        return numSee == true ? 1: 0;
    }
}
