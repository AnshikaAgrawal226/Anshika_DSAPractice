public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int leftproduct =1;
        //calculating leftproduct of each element
        for(int i =0; i<nums.length; i++){
            ans[i] = leftproduct;
            leftproduct *= nums[i]; 
        } 

        //Calculating final product
        int rightproduct =1;
        for(int i =nums.length-1;i>=0; i--){
            ans[i] *= rightproduct;
            rightproduct *= nums[i];
        }

        return ans;
    }
}
