public class Solution {
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
         if(a.size()>b.size()) return findMedianSortedArrays(b, a);
        
        int x = a.size();
        int y = b.size();
        
        int left = 0; int right = x;
        
        while(left<=right){
            int partX = (left+right)/2;
            int partY = (x+y+1)/2-partX;
            
            int leftMaxX = (partX==0)? Integer.MIN_VALUE: a.get(partX-1);
            int leftMaxY = (partY==0)? Integer.MIN_VALUE:b.get(partY-1);
            
            int rightMinX = (partX==x)? Integer.MAX_VALUE:a.get(partX);
            int rightMinY = (partY==y)? Integer.MAX_VALUE:b.get(partY);
            
            if((leftMaxX<=rightMinY)&& (leftMaxY<=rightMinX)){
                if((x+y)%2==0){
                    return ((double)Math.max(leftMaxX,leftMaxY)+Math.min(rightMinX, rightMinY))/2;
                }else{
                    return ((double)Math.max(leftMaxX, leftMaxY));
                }
           }else if(leftMaxX>rightMinY) {
               right = partX-1;
               
           }
           else left = partX+1;
    }
    return -1;
    }
}
