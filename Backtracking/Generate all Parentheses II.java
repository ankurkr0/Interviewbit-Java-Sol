public class Solution {
     ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> generateParenthesis(int A) {
        recursiveFunction(new char[2*A] , 0 , 0 , 0 , A);
        Collections.sort(list);
        return list;
    }

    private void recursiveFunction(char[] arr , int currIndex , int opened , int closed , int toBeOpened )
    {
        if(currIndex >= arr.length) {
            list.add(new String(arr));
            return;
        }

        if(opened > closed) {
            arr[currIndex] = ')';
            recursiveFunction(arr , currIndex+1 , opened, closed + 1, toBeOpened);
        }

        if(toBeOpened != 0) {
            arr[currIndex] = '(';
            recursiveFunction(arr , currIndex+1 ,  opened+1 , closed , toBeOpened-1 );
        }

    }
}
