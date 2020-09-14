public class Solution {
    public int maxArea(ArrayList<Integer> A) {
         int left = 0, right = A.size() - 1;
    	int maxArea = 0;

	while (left < right) {
        if (A.get(left) < A.get(right)){
		maxArea = Math.max(maxArea, A.get(left)* (right - left));
			left++;
        } 
		else{
            maxArea = Math.max(maxArea, A.get(right)* (right - left));
            right--;
        }
	}
	return maxArea;
    } 
}
