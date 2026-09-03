public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int start =0;
        int end = nums.length-1;
        while(start<end){
            int mid = start+ (end-start)/2;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            } 
            else if(nums[mid]<nums[mid+1]){
                if(nums[mid]>nums[end]){
                    start = mid+1;
                }
                else{
                    end = mid;
                }
                
            }
            else if(mid>0){
                if(nums[mid]<nums[mid-1]){
                    return nums[mid];
                }
            }
            
            
        }
        return nums[0];
    }
}
