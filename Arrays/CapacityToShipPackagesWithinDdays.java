public class CapacityToShipPackagesWithinDdays {

    public int shipWithinDays(int[] weights, int days) {
        //similar to koko eating babanas
        int Maxsum = 0; //Maximum possible weight
        for( int i =0; i<weights.length; i++){
            Maxsum= Maxsum+ weights[i];
        }
        int start =1;
        int end = Maxsum;
        while(start<=end){
            int mid =start+ (end-start)/2;
            int sum =0;
            int expdays = 0; //expexted days
            for(int i =0; i<weights.length; i++){
                if(weights[i]>mid){
                    sum = weights[i];
                    break;
                }
                if((sum+weights[i] )<mid){
                    sum = sum+weights[i];
                }
                else if((sum+weights[i] )==mid){
                    sum =0;
                    expdays++;
                }
                else{
                    expdays++;
                    sum = weights[i];
                }
            }
            if(sum<=mid && sum!=0){
              expdays++;
            }
            if(sum>mid){
                start = mid+1;
            }
            else if(expdays<=days){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return start;
    }
}