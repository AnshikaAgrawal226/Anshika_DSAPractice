public class RotateArray {
    public void rotate(int[] nums, int k) { 
        k = k % nums.length;     
        //first, reverse the entire array
        int l1 =0; 
        int h1 = nums.length-1;
        reverse(l1, h1, nums);

        // reverse the first k positions elements
        int l2 = 0;
        int h2 = k-1;
        reverse(l2, h2, nums);

        //Reverse the remaining elements
        int l3 = k;
        int h3 = nums.length-1;
        reverse(l3,h3, nums);
    }
    static int[] reverse(int low, int high, int[] nums){
        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        } 
        return nums;
    }
}
