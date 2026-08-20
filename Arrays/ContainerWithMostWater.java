public class ContainerWithMostWater {
    class Solution {
        public int maxArea(int[] height) {
            int low = 0;
            int high = height.length-1;
            int maxheight =0;

            while(low<high){
                int currentarea =0;
                int h = Math.min(height[low], height[high]);
                int w = high-low;
                currentarea = h*w;
                maxheight = Math.max(maxheight, currentarea);

                if(height[low]< height[high]){
                    low++;
                }
                else{
                    high--;
                }

            }
            return maxheight;
        
        }
    } 
}
