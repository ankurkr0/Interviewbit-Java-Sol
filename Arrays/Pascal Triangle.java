public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
         ArrayList<ArrayList<Integer>> triangle = new ArrayList<> ();
        if(A <= 0){
            return triangle;
        }
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for(int i=1; i<A; i++){
            ArrayList<Integer> prevRow = triangle.get(i-1);
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            
            for(int j=1; j < i; j++){
                row.add(prevRow.get(j)+prevRow.get(j-1));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
