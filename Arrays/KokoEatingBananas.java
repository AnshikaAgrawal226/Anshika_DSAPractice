public class KokoEatingBananas {
    class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max =0;
        int minspeed = 0;
        //calculating maximum possible bananas he can eat  in one hror max possible speed
        for(int i =0; i<piles.length; i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }
        int start =1;
        int end = max;
        long time =0;
        while(start<=end){
            //calculating the speed with which he is eating bananas
            int mid = start+(end-start)/2;

            //time taken by him if he is eating with mid speed
            time =0;
            for(int i =0;i<piles.length; i++){
                if(piles[i] % mid ==0){
                    time = time+ (piles[i]/mid);
                }
                else{
                    time = time+ ((piles[i]/mid)+1);
                }
            }

            if(time<=h){
                //it means he finished eating is less time so he has to eat with slow speed
                //if time is equal to h, it is even possible than he can finish in same time with slower speed
                end = mid-1;
            }
            else if(time>h){
                //if time is greater then h,it means he finished eating inmore than assigned time so he has to eat with faster speed
                
                start= mid+1;
            }

        }
        return start;

    }
}
}
