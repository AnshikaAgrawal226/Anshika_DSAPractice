import java.util.Arrays;

public class threeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int closestsum =0;
        int mindifference= Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i =0; i<nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;
            
            while(j<k){
                int diff =0;
                int sum = nums[i]+ nums[j]+ nums[k];
                if(sum>target){
                    diff = sum-target;
                }
                else{
                    diff = target-sum;
                }
                
                //mindifference= Math.min(mindifference,diff);
                if(mindifference>diff){
                    mindifference = diff;
                    closestsum = sum;
                }
                if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
                
                
            }

        }
        return closestsum;
    }
}
