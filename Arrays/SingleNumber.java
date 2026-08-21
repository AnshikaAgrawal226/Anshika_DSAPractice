//Approach:- Bit Manipulation
//Time Complexity:- O(n);
//Space Complexity:- O(1);

public class SingleNumber {
    class Solution {
        public int singleNumber(int[] nums) {
            int ans = 0 ;
            for(int i =0;i<nums.length; i++){
                ans =(nums[i] ^ ans);

            }
            return ans;
        }
    }
}
