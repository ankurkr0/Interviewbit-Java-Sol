public class Solution {
    public int romanToInt(String A) {
        int i = A.length() - 2;
        int b = value(A.charAt(i+1));
        for(; i>=0; i--){
            if(value(A.charAt(i)) < value(A.charAt(i+1))){
                b -= value(A.charAt(i));
            }else 
            b += value(A.charAt(i));  
        }
        return b;
    }
    public int value(char x){
        if(x=='I') return 1;
        else if(x=='V') return 5;
        else if(x== 'X') return 10;
        else if(x== 'L') return 50;
        else if(x== 'C') return 100;
        else if(x== 'D') return 500;
        else if(x== 'M') return 1000;
        return 0;
    }
}
