import java.util.HashSet;

public class MaximumSumofDistinctSubarraysWithLengthK {
    public long maximumSubarraySum(int[] nums, int k) {
        if(nums.length<k ){
            return 0;
        }
        int start =0;
        long maxSum  =0;
        long sum =0;
        HashSet<Integer> set = new HashSet<>();
        for(int end =0;end<nums.length;end++){
            while(set.contains(nums[end])){
                set.remove(nums[start]);
                sum-= nums[start];
                start++;
            }
            set.add(nums[end]);
            sum = sum+ nums[end];

            
            if(end-start ==k){
                set.remove(nums[start]);
                sum -= nums[start];
                start++;
            }
            if((end-start)==k-1){
                maxSum = Math.max(maxSum, sum);
            }

        }
        return maxSum;
        
    }

}
