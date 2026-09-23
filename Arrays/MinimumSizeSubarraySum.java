public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int sum =0;
        int start =0;
        int minlength =Integer.MAX_VALUE;
        for(int i =0; i<nums.length; i++){
            sum = sum+ nums[i];
            if(sum>=target){
                int length = i-start+1;
                minlength = Math.min(minlength, length);
                while(sum-nums[start]>=target){
                    
                    sum = sum-nums[start];
                    start++;
                    
                }
                length = i-start+1;
                minlength = Math.min(minlength, length);
            }
        }
        
        if(sum<target){
            return 0;
        }
        return minlength;
        
    }
}
