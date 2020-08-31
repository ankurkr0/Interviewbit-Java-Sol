public class Solution {
    public int solve(ArrayList<String> A) {
         if(A.size()<3){
            return 0;
        }

        double a = Double.valueOf(A.get(0));
        double b = Double.valueOf(A.get(1));
        double c = Double.valueOf(A.get(2));

        for(int i=3;i<A.size();i++){
            if(a+b+c>1 && a+b+c<2){
                return 1;
            }

            double val = Double.valueOf(A.get(i));

            if(a+b+c >=2){
                if(a>b && a > c){
                    a = val;
                }
                else if(b > c && b > a){
                    b = val;
                }
                else{
                    c = val;
                }
            }
            else{
                if(a<b && a < c){
                    a = val;
                }
                else if(b < c && b < a){
                    b = val;
                }
                else{
                    c = val;
                }
            }
        }

        if(a+b+c>1 && a+b+c<2){
            return 1;
        }
        else{
            return 0;
        }
    }
}
