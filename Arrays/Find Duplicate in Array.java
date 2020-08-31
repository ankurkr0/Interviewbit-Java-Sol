Method 1:

public class Solution {
    public int repeatedNumber(final List<Integer> a) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num : a){
            if(set.contains(num)){
                return num;
            } else {
                set.add(num);
            }
        }
        return a.size()+1;
    }
}

Method 2:

public class Solution {
  public int repeatedNumber(final List<Integer> A) {
    int tortoise = A.get(0);
    int hare = A.get(0);
    while (true) {
      tortoise = A.get(tortoise);
      hare = A.get(A.get(hare));
      if (tortoise == hare) {
        break;
      }
    }
    int p1 = A.get(0);
    int p2 = tortoise;
    while (p1 != p2) {
      p1 = A.get(p1);
      p2 = A.get(p2);
    }
    return p1;
  }
}

Method 3:
/leetcode question: Find all the elements that appear twice in this array.

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> output = new ArrayList<>();
        
        for(int i = 0; i<nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            
            if(nums[index] < 0)
                output.add(index + 1);
            
            nums[index] =  - nums[index];
        }
        return output;
    }
}

