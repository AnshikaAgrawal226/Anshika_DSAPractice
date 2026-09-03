public int trap(int[] height) {
        int low =0;
        int high = height.length-1;
        int water =0;
        int left_max =0;
        int right_max =0;
        while(low< high){
            if(height[low] <= height[high]){
                if(height[low]>left_max){
                    left_max = height[low];
                }
                else{
                    water = water +(left_max- height[low]);
                }
                low++;
            }
            else{
                if(height[high]>right_max){
                    right_max = height[high];
                }
                else{
                    water = water +(right_max- height[high]);
                }
                high--;
            }
        }
        return water;
        
    }