public class ReplaceWithGreatestRightElement {
    class Solution {
        public int[] replaceElements(int[] arr) {
            int start = 0;
            int [] ans = new int [arr.length];
            while(start<arr.length-1){
                int end = arr.length-2;
                int max = arr[arr.length-1];
                while(end>start){
                    if(arr[end]>max){
                        max = arr[end];
                    }
                    end--;
                }
                ans[start] = max;
                start++;
            }
            ans[start] =-1;
            return ans;

        }
    }
}
