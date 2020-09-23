public class Solution {
    public ArrayList<String> letterCombinations(String A) {
        ArrayList<String> list = new ArrayList<>();
        if(A == null || A.length() == 0) return list;
        char[][] map = {{'0'},{'1'},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        backtrack(A,list,map,new StringBuilder(),0);
        return list;
    }
    private void backtrack(String A, List<String> list,char[][] map, StringBuilder sb, int start){
        if(start == A.length()) {
            list.add(new String(sb));
            return;
        }
        int num = A.charAt(start) - '0';
        for(int i = 0;i< map[num].length;i++){
            sb.append(map[num][i]);
            backtrack(A,list,map,sb,start+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
