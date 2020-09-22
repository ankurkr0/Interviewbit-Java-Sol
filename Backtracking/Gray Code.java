public class Solution {
    public ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);                                
        if(a == 0) 
        return ans;
        int increase = 1;
        for(int i = 0;i<a;i++){                    
            int len = ans.size();                 
            for(int j = len-1;j>=0;j--){            
                ans.add(ans.get(j)+increase);     
            }
            increase *= 2;
        }
        return ans;
        
    }
}
