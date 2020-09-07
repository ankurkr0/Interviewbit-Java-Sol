public class Solution {
    public String countAndSay(int A) {
        if(A<=0) return "";
        String string = "1";
        StringBuilder sb = new StringBuilder();
        
        while(A>1){
            char[] arr = string.toCharArray();
            int count =1;
            int i =0;
            while(i < arr.length){
                if(i+1<arr.length && arr[i]==arr[i+1]){
                    ++count;
                    
                }else {
                    sb.append(count).append(arr[i]);
                    count =1;
                }
                ++i;
            }
            string = sb.toString();
            sb.delete(0, sb.length());
            --A;
        }
        return string;
    }
}
