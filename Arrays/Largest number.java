public class Solution {
    public String largestNumber(final List<Integer> A) {
        int n = A.size();
        if(n==0) return "";
        String[] sa = new String[n];
        
        for(int i =0; i<n; i++){
            sa[i] = Integer.toString(A.get(i));
        }
        Arrays.sort(sa, new Comparator<String>(){
          public int compare(String a, String b){
              String o1 = a+b;
              String o2 = b+a;
              return o2.compareTo(o1);
          }  
        });
        if(sa[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        
        for(String s : sa){
            sb.append(s);
        }
        return sb.toString();
    }
}
