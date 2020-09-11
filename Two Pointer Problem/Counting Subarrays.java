public class Solution {
    public int solve(ArrayList<Integer> a, int b) {
        // Method 1:
        int n=a.size();
    int sum;
    int count=0;
    for(int i=0;i<n;i++)
    {
        sum=0;
        for(int j=i;j<n;j++)
        {
            sum=sum+a.get(j);
            if(sum<b)
            {
                count++;
               
            }
            else
                break;
        }
    }
    return count;
        
        
        // Method 2:
        int i=0;
        int j=0;
        int sum = 0;
        int count=0;
        while (j<a.size()) {
            sum+=a.get(j);
            if (sum < b) {
                count+=(j-i+1);
                j++;
            } else {
                while (i<j && sum>=b) {
                    sum-=a.get(i);
                    i++;
                }
                if (sum < b) {
                    count+=(j-i+1);
                }
                j++;
            }
        }
        return count;
    }
}
