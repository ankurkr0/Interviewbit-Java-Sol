Method 1:
public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int reminder = 0;
       while (A.size() > 1 && A.get(0) == 0) {
            A.remove(0);
        }
        for (int i = A.size() - 1; i >= 0; i--) {
            int num = A.get(i);
            
            if(num < 9){
                A.remove(i);
                A.add(i,num+1);
                reminder = 0;
                break;
            }else{
                A.remove(i);
                A.add(i,0);
                reminder = 1;
            }
        }
        if(reminder == 1){
            A.add(0,1);
        }
        return A;
    }
}

Method 2:
//You may assume the integer does not contain any leading zero, except the number 0 itself.

class Solution {
    public int[] plusOne(int[] A) {
        int n = A.length;
        for(int i = n - 1; i >=0; i--){
            if(A[i] < 9){
                A[i]++;
                return A;
            }
            A[i] = 0;
        }
        
        int[] new_num = new int[n+1];
        new_num[0] = 1;
        return new_num;
    }
}
