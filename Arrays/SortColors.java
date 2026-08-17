public class SortColors {
    class Solution {
    public void sortColors(int[] nums) {
        int start =0;
        int end = nums.length-1;
        int k =0;

        while(k<=end){
            if(nums[k] ==2){
                //swap
                int temp = nums[end];
                nums[end] = nums[k];
                nums[k] = temp;

                end--;
            }
            else if(nums[k] ==0){
                //swap
                int temp = nums[k];
                nums[k] = nums[start];
                nums[start] = temp;

                start++;
                k++;
            }
            else{
                k++;

            }
        }

    }
}
}
