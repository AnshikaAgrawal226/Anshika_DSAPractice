public class MoveZeroes {
    class Solution {
    public void moveZeroes(int[] nums) {

        int start =0;
        int k =0;
        while(k<nums.length){
            if(nums[k]!=0){
                //swap
                int temp =nums[k];
                nums[k]= nums[start];
                nums[start] = temp;

                start++; 
            }
            //else{
                k++;
            //}
        }
        
    }
}
}
