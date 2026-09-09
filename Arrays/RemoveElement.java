public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k =0;
        int start =0;
        int end =0;
        while(end<nums.length){
            if(nums[end]!=val){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                k++;
            }
            
            //start++;
            end++;
        }
        return k;
    }
}
