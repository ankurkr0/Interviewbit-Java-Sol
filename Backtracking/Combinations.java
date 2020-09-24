public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int a, int b) {
      
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        addCombinations(ans,1,a,b,temp);

        return ans;
    }
     public void addCombinations(ArrayList<ArrayList<Integer>> ans, int pos, int a, int b, ArrayList<Integer> temp){

        if(temp.size() == b){
            ans.add(new ArrayList<>(temp));
        }
        else if(temp.size() > b){
            return;
        }

        for(int i=pos;i<=a;i++){
            temp.add(i);
            addCombinations(ans,i+1,a,b,temp);
            temp.remove(temp.size()-1);
        }
    }
    
}
