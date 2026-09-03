public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count=0;
        int element = -1;
        for(int i =0; i<nums.length; i++){
            if(i ==0){
                count =1;
                element = nums[i];
            }
            else{
                if(nums[i] == element){
                    
                        count++;
                    }
                else{
                        if(count>0){
                            count--;
                        
                        }
                        else{
                            count++;
                            element = nums[i]; 
                        }
                }
                    

            }
            
        }
        return element;
    }
}
