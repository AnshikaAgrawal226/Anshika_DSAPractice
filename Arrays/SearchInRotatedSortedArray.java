public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int start = 0;
        int end =nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]== target){
                return mid;
            }
            //Atleast one half will be sorted
            //check if left half is sorted
            if(nums[start]<=nums[mid]){
                //means left half is sorted
                //now check if target is present in left half
                if(target>=nums[start] && target<nums[mid]){
                    end = mid;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                //means right half is sorted
                //now check if the target is present in the right half
                if(target>nums[mid] && target<=nums[end]){
                    start = mid+1;
                }
                else{
                    end = mid;
                }
            }
        }
        return -1;
    }
}
