public class Solution {
    public ArrayList<Integer> flip(String A) {
      
       ArrayList<Integer> ans = new ArrayList<>();
       
       int cumulative=0,left=0,right=0,max_sum=0;
        int left_ans=0,right_ans=0;
        
       for(int i=0;i<A.length();i++){
           int value = (A.charAt(i)=='0') ? 1 : -1;
           cumulative+=value;
    
           if(cumulative<0){
               left=i+1;
               cumulative=0;
           }else{
               if(cumulative>max_sum){
                   max_sum=cumulative;
                   left_ans=left;
                   right_ans=i;
               }
           }
       }

       if(max_sum<=0){
           return ans;
       }else{
           ans.add(left_ans+1);
           ans.add(right_ans+1);
       }
       return ans;
    }
}
