public class RemovingMinimumandMaximumFromArray {
    public int minimumDeletions(int[] nums) {
        int max =nums[0];
        int maxindex =0;
        int min =nums[0];
        int minindex =0;
        int count=0;
        int leftcount =0;
        int rightcount=0;
        int bothcount=0;
        for(int i =0; i<nums.length; i++){
            if(max<nums[i]){
                max = nums[i];
                maxindex = i;
            }
            if(nums[i]<min){
                min = nums[i];
                minindex =i;
            }
        }

        int left = Math.min(maxindex, minindex);
        int right = Math.max(maxindex, minindex);
        
        //deletion of both from left 
            int i =0;
            while(i<=right){
                leftcount++;
                i++;
            }
            
        //delete both elements from right
            int j =nums.length-1;
            while (j>=left) {
                rightcount++;
                j--;
            }
        //delete left element from left amd right element from right

            int k =0;
            while(k<=left){
                bothcount++;
                k++;
            }
            k= nums.length-1;
            while(k>=right){
                bothcount++;
                k--;
            }
            
            count = Math.min(leftcount,rightcount);
            count = Math.min(count, bothcount);
        
        return count;

    }
}
