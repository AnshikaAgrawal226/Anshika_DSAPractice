public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        
        for(int i =0;i<nums.length; i++){
            int start = i;
            int sum=nums[start];
                
            while(start<nums.length){
                
                if(sum<k){
                    start++;
                    if(start<nums.length){
                        sum = sum+ nums[start];
                    }
                }
                else if(sum == k){
                    count++;                     
                    start++;
                    if(start<nums.length){
                        sum = sum + nums[start];
                    }
                }
                else{
                    start++;
                    if(start<nums.length){
                        sum = sum+ nums[start];
                    }
                    
                }
            }
        }
        return count;
    }
}
